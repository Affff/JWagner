// Generated from JWagner.g4 by ANTLR 4.0

    package ru.obolensk.afff.wagner.jwac.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JWagnerLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NOTE=7, TACTS=8, NOTEKEY=9, 
		DIEZ=10, OCTAVE=11, ID=12, INT=13, CMDEND=14, ROWCOMMENT=15, BLOCKCOMMENT=16, 
		WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'tune'", "'play'", "'melody'", "'}'", "'go'", "NOTE", "TACTS", 
		"NOTEKEY", "'#'", "OCTAVE", "ID", "INT", "CMDEND", "ROWCOMMENT", "BLOCKCOMMENT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NOTE", "TACTS", "NOTEKEY", 
		"DIEZ", "OCTAVE", "LETTER", "DIGIT", "ID", "INT", "CMDEND", "ROWCOMMENT", 
		"BLOCKCOMMENT", "WS"
	};


	public JWagnerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JWagner.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16: ROWCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 17: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void BLOCKCOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void ROWCOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\23\u0086\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\5\bD\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\6\17W\n\17\r\17\16\17X\3\20\6\20\\\n\20\r\20"+
		"\16\20]\3\21\6\21a\n\21\r\21\16\21b\3\22\3\22\3\22\3\22\7\22i\n\22\f\22"+
		"\16\22l\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23v\n\23\f\23"+
		"\16\23y\13\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u0081\n\24\r\24\16\24"+
		"\u0082\3\24\3\24\4jw\25\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\2\1\33\2\1\35\16\1\37\17\1!\20\1#\21\2%"+
		"\22\3\'\23\4\3\2\7\4C\\c|\3\62;\3==\4\f\f\17\17\5\13\f\17\17\"\"\u008b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\3)\3\2\2\2\5+\3\2\2\2\7\60\3\2\2\2\t\65\3\2\2\2\13<\3\2\2\2\r>\3\2"+
		"\2\2\17A\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3"+
		"\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37[\3\2\2\2!`\3\2\2\2#d\3\2\2\2%q\3\2\2"+
		"\2\'\u0080\3\2\2\2)*\7}\2\2*\4\3\2\2\2+,\7v\2\2,-\7w\2\2-.\7p\2\2./\7"+
		"g\2\2/\6\3\2\2\2\60\61\7r\2\2\61\62\7n\2\2\62\63\7c\2\2\63\64\7{\2\2\64"+
		"\b\3\2\2\2\65\66\7o\2\2\66\67\7g\2\2\678\7n\2\289\7q\2\29:\7f\2\2:;\7"+
		"{\2\2;\n\3\2\2\2<=\7\177\2\2=\f\3\2\2\2>?\7i\2\2?@\7q\2\2@\16\3\2\2\2"+
		"AC\5\23\n\2BD\5\25\13\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\27\f\2F\20\3"+
		"\2\2\2GH\5\37\20\2H\22\3\2\2\2IJ\5\31\r\2J\24\3\2\2\2KL\7%\2\2L\26\3\2"+
		"\2\2MN\5\33\16\2N\30\3\2\2\2OP\t\2\2\2P\32\3\2\2\2QR\t\3\2\2R\34\3\2\2"+
		"\2SV\5\31\r\2TW\5\31\r\2UW\5\33\16\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y\36\3\2\2\2Z\\\5\33\16\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^ \3\2\2\2_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2c\"\3\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2gi\13\2\2\2hg\3\2\2\2il\3"+
		"\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\t\5\2\2no\3\2\2\2op\b"+
		"\22\2\2p$\3\2\2\2qr\7\61\2\2rs\7,\2\2sw\3\2\2\2tv\13\2\2\2ut\3\2\2\2v"+
		"y\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7,\2\2{|\7\61\2\2"+
		"|}\3\2\2\2}~\b\23\3\2~&\3\2\2\2\177\u0081\t\6\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\b\24\4\2\u0085(\3\2\2\2\13\2CVX]bjw\u0082";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}