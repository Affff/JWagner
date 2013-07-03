package ru.obolensk.afff.wagner.runtime;


public class Note implements MidiElement {
	
	public static final int NOT_NOTE = -1;
	private final static char[] notes = new char[] { 'C', 'D', 'E', 'F', 'G',
			'A', 'B' };		
	
	private final int channel;
	private final String note;
	private final boolean off;
	
	public Note(int channel, String note) {
		this(channel, note, false);
	}

	public Note(int channel, String note, boolean off) {
		this.channel = channel;
		this.note = note;
		this.off = off;
	}

	public String getNote() {
		return note;
	}

	public int getMidiNote() {
		return decodeNoteToMIDI(note);
	}

	public boolean isOff() {
		return off;
	}

	public int getChannel() {
		return channel;
	}

	private static int decodeNoteToMIDI(String note) {
		if (note == null || note.length() == 1) {
			return NOT_NOTE;
		}
		char noteSymbol = Character.toUpperCase(note.charAt(0));
		int noteIdx = findFirst(noteSymbol);
		if (noteIdx == NOT_NOTE) {
			return NOT_NOTE;
		}
		switch (noteIdx) {
		case 0:
			break;
		case 1:
			noteIdx++;
			break;
		case 2 :
		case 3 :
			noteIdx += 2;
			break;
		default :
			noteIdx += (noteIdx - 1);
		}
		boolean diez = ((note.length() == 3) && (note.charAt(1) == '#'));
		if (diez && (noteIdx != 4) && (noteIdx != 11)) {
			noteIdx++;
		}
		int octave;
		try {
			octave = Integer.valueOf(Character.toString(note.charAt(note.length()-1)));
		} catch (NumberFormatException e) {
			return NOT_NOTE;
		}
		return noteIdx + octave * 12;
	}
	
	private static int findFirst(char noteSymbol) {
		for (int i = 0; i < notes.length; i++) {
			if (noteSymbol == notes[i]) {
				return i;
			}
		}
		return NOT_NOTE;
	}	
}
