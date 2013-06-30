package ru.obolensk.afff.wagner.runtime;

import java.io.IOException;
import java.util.ArrayList;
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

	private static int velosity = 60; // FIXME velosity not changed now, setted
										// as for piano
	private static long tactLenght = 700; // FIXME tact size not changed now,
											// setted normal speed melody

	private int currTact = 0;
	private LinkedList<List<MidiElement>> stack = new LinkedList<List<MidiElement>>();

	public JWagnerRuntime() throws Exception {
		logger.trace("JWagnerRuntime creation began...");
		if (synthesizer != null && synthesizer.isOpen()) {
			close();
		}
		synthesizer = MidiSystem.getSynthesizer();
		synthesizer.open();
		channels = synthesizer.getChannels();
		fillStack(1); // add #0 tact element list
		logger.debug("JWagnerRuntime created.");
	}

	public void playNote(int note, int length, int channel)
			throws InterruptedException {
		logger.trace("playNote called (note={1},length={2},channel={3})", note, length, channel);
		stack.get(currTact).add(new Note(channel, note));
		fillStaskIfNeeded(length);
		stack.get(currTact + length).add(new Note(channel, note, true));
	}

	private void fillStaskIfNeeded(int length) {
		fillStack((currTact + 1 + length) - stack.size());
	}

	public void goForward(int forwardTactsCount) {
		logger.trace("go forward for {1} tacts.", forwardTactsCount);
		fillStack(forwardTactsCount);
		currTact += forwardTactsCount;
	}

	private void fillStack(int forwardTactsCount) {
		for (int i = 0; i < forwardTactsCount; i++) {
			stack.add(new ArrayList<MidiElement>());
		}
	}

	public void play() throws InterruptedException {
		List<MidiElement> elements;
		while ((elements = stack.pollFirst()) != null) {
			for (MidiElement el : elements) {
				if (el instanceof Note) {
					Note note = (Note) el;
					MidiChannel channel = channels[note.getChannel()];
					if (!note.isOff()) {
						channel.noteOn(note.getNote(), velosity);
					} else {
						channel.noteOff(note.getNote());
					}
				}
			}
			Thread.sleep(tactLenght);
		}
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
