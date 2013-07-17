package ru.obolensk.afff.wagner.runtime;

import java.util.HashMap;
import java.util.Map;

public class TempoDecoder {
	
	public static final String DEFAULT_TEMPO = "moderato";

	private static final Map<String, Long> TACTS_TEMPO_TABLE = new HashMap<String, Long>();
	
	static {
		TACTS_TEMPO_TABLE.put("grave", freqToTactLen(44));
		TACTS_TEMPO_TABLE.put("largo", freqToTactLen(48));
		TACTS_TEMPO_TABLE.put("largamente", freqToTactLen(50));
		TACTS_TEMPO_TABLE.put("adagio", freqToTactLen(52));
		TACTS_TEMPO_TABLE.put("lento", freqToTactLen(54));
		TACTS_TEMPO_TABLE.put("lentamente", freqToTactLen(56));
		TACTS_TEMPO_TABLE.put("larghetto", freqToTactLen(58));
		TACTS_TEMPO_TABLE.put("andante assai", freqToTactLen(61));
		TACTS_TEMPO_TABLE.put("adagietto", freqToTactLen(64));
		TACTS_TEMPO_TABLE.put("andante", freqToTactLen(64));
		TACTS_TEMPO_TABLE.put("andante maestoso", freqToTactLen(65));
		TACTS_TEMPO_TABLE.put("andante mosso", freqToTactLen(69));
		TACTS_TEMPO_TABLE.put("comodo", freqToTactLen(72));
		TACTS_TEMPO_TABLE.put("comodamente", freqToTactLen(72));
		TACTS_TEMPO_TABLE.put("andante non troppo", freqToTactLen(73));
		TACTS_TEMPO_TABLE.put("andante con moto", freqToTactLen(76));
		TACTS_TEMPO_TABLE.put("andantino", freqToTactLen(80));
		TACTS_TEMPO_TABLE.put("moderato assai", freqToTactLen(84));
		TACTS_TEMPO_TABLE.put("moderato", freqToTactLen(88));
		TACTS_TEMPO_TABLE.put("con moto", freqToTactLen(92));
		TACTS_TEMPO_TABLE.put("allegretto moderato", freqToTactLen(96));
		TACTS_TEMPO_TABLE.put("allegretto", freqToTactLen(100));
		TACTS_TEMPO_TABLE.put("allegretto mosso", freqToTactLen(104));
		TACTS_TEMPO_TABLE.put("animato", freqToTactLen(108));
		TACTS_TEMPO_TABLE.put("animato assai", freqToTactLen(112));
		TACTS_TEMPO_TABLE.put("allegro moderato", freqToTactLen(116));
		TACTS_TEMPO_TABLE.put("tempo di marcia", freqToTactLen(120));
		TACTS_TEMPO_TABLE.put("allegro non troppo", freqToTactLen(124));
		TACTS_TEMPO_TABLE.put("allegro tranquillo", freqToTactLen(128));
		TACTS_TEMPO_TABLE.put("allegro", freqToTactLen(132));
		TACTS_TEMPO_TABLE.put("allegro molto", freqToTactLen(149));
		TACTS_TEMPO_TABLE.put("allegro assai", freqToTactLen(156));
		TACTS_TEMPO_TABLE.put("allegro agitato", freqToTactLen(164));
		TACTS_TEMPO_TABLE.put("allegro animato", freqToTactLen(164));
		TACTS_TEMPO_TABLE.put("allegro vivace", freqToTactLen(172));
		TACTS_TEMPO_TABLE.put("vivo", freqToTactLen(180));
		TACTS_TEMPO_TABLE.put("vivace", freqToTactLen(180));
		TACTS_TEMPO_TABLE.put("presto", freqToTactLen(192));
		TACTS_TEMPO_TABLE.put("prestissimo", freqToTactLen(200));
	}

	public static long getTactLenFromTempo(String tempoStr) {
		Long tempo = TACTS_TEMPO_TABLE.get(tempoStr);
		if (tempo == null) {
			tempo = TACTS_TEMPO_TABLE.get(DEFAULT_TEMPO);
		}
		return tempo;
	}

	private static long freqToTactLen(float freq) {
		return StrictMath.round((60.0f / freq) * 1000.0f);
	}
}
