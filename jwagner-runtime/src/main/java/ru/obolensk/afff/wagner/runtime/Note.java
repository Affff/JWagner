package ru.obolensk.afff.wagner.runtime;


public class Note implements MidiElement {
	private final int channel;
	private final int note;
	private final boolean off;
	
	public Note(int channel, int note) {
		this(channel, note, false);
	}

	public Note(int channel, int note, boolean off) {
		this.channel = channel;
		this.note = note;
		this.off = off;
	}

	public int getNote() {
		return note;
	}

	public boolean isOff() {
		return off;
	}

	public int getChannel() {
		return channel;
	}
}
