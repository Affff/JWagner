package ru.obolensk.afff.wagner.runtime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JWagnerRuntime implements AutoCloseable {

	private static final Logger logger = LoggerFactory
			.getLogger(JWagnerRuntime.class);

	private Synthesizer synthesizer;
	private MidiChannel[] channels;

	private static int velosity = 60; // FIXME velosity not changed now, must be setted from instrument
	private static long tactLenght; // FIXME tact size must valuate a smallest note part - 1/128

	private int currTact = 0;
	private LinkedList<List<MidiElement>> stack = new LinkedList<List<MidiElement>>();
	private Deque<Integer> tactStack = new LinkedList<Integer>();

	public JWagnerRuntime() throws Exception {
		logger.trace("JWagnerRuntime creation began...");
		if (synthesizer != null && synthesizer.isOpen()) {
			close();
		}
		synthesizer = MidiSystem.getSynthesizer();
		synthesizer.open();
		channels = synthesizer.getChannels();
		setTempo(null); // setup default playing speed
		fillStack(1); // add #0 tact element list
		logger.debug("JWagnerRuntime created.");
	}

	public void setTempo(String tempo) {
		tactLenght = TempoDecoder.getTactLenFromTempo(tempo);
	}

	public void playNote(String note, int length, int channel)
			throws InterruptedException {
		logger.trace("playNote called (note={},length={},channel={})", note,
				length, channel);
		stack.get(currTact).add(new Note(channel, note));
		fillStaskIfNeeded(length);
		stack.get(currTact + length).add(new Note(channel, note, true));
	}
	public void goForward(int forwardTactsCount) {
		logger.trace("go forward for {} tacts.", forwardTactsCount);
		fillStaskIfNeeded(forwardTactsCount);
		currTact += forwardTactsCount;
		logger.trace("currTact = {}", currTact);
	}

	private void fillStaskIfNeeded(int length) {
		fillStack((currTact + 1 + length) - stack.size());
	}


	private void fillStack(int forwardTactsCount) {
		for (int i = 0; i < forwardTactsCount; i++) {
			stack.add(new ArrayList<MidiElement>());
		}
		logger.trace("Stack size = {}", stack.size());
	}

	public void play() throws InterruptedException {
		List<MidiElement> elements;
		while ((elements = stack.pollFirst()) != null) {
			for (MidiElement el : elements) {
				if (el instanceof Note) {
					Note note = (Note) el;
					int midiNote = note.getMidiNote();
					if (midiNote == Note.NOT_NOTE) {
						continue;
					}
					MidiChannel channel = channels[note.getChannel()];
					if (!note.isOff()) {
						channel.noteOn(midiNote, velosity);
					} else {
						channel.noteOff(midiNote);
					}
				}
			}
			Thread.sleep(tactLenght);
		}
	}

	public void pushTact() {
		tactStack.push(currTact);
		logger.trace("Push tact = {}", currTact);
	}

	public void popTact() {
		currTact = tactStack.pop();
		logger.trace("Pop tact = {}", currTact);
	}

	@Override
	public void close() throws IOException {
		logger.trace("close() called.");
		if (synthesizer != null && synthesizer.isOpen()) {
			synthesizer.close();
		}
		logger.debug("Runtime closed.");
	}
}
