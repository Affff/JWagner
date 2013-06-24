package ru.obolensk.afff.wagner.runtime;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class JWagnerRuntime {
	
	private static Synthesizer synthesizer;
	
	public static void init() throws MidiUnavailableException {
		if (synthesizer != null && synthesizer.isOpen()) {
			destroy();
		}
		synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
	}
	
	public static void play() throws InterruptedException {
        MidiChannel[] channels = synthesizer.getChannels();
        channels[0].noteOn(60, 60);
        Thread.sleep(200);
        channels[0].noteOff(60);
        Thread.sleep(200);
	}
	
	public static void destroy() {
		if (synthesizer != null && synthesizer.isOpen()) {
			synthesizer.close();
		}
	}
}
