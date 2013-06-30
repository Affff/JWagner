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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, INT=7, LETTER=8, DIGIT=9, 
		NEWLINE=10, ROWCOMMENT=11, BLOCKCOMMENT=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'play'", "'melody'", "'}'", "'go'", "ID", "INT", "LETTER", "DIGIT", 
		"NEWLINE", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "ID", "INT", "LETTER", "DIGIT", 
		"NEWLINE", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
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
		case 10: ROWCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 11: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 12: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\17e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\6"+
		"\7\64\n\7\r\7\16\7\65\3\b\6\b9\n\b\r\b\16\b:\3\t\3\t\3\n\3\n\3\13\6\13"+
		"B\n\13\r\13\16\13C\3\f\3\f\7\fH\n\f\f\f\16\fK\13\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\7\rU\n\r\f\r\16\rX\13\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16`\n"+
		"\16\r\16\16\16a\3\16\3\16\4IV\17\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\2\31\16\3\33\17\4\3\2\7\4C\\c|\3\62"+
		";\3==\4\f\f\17\17\5\13\f\17\17\"\"k\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2"+
		"\2\2\5\37\3\2\2\2\7$\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r\60\3\2\2\2\178\3"+
		"\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25A\3\2\2\2\27E\3\2\2\2\31P\3\2\2\2\33"+
		"_\3\2\2\2\35\36\7}\2\2\36\4\3\2\2\2\37 \7r\2\2 !\7n\2\2!\"\7c\2\2\"#\7"+
		"{\2\2#\6\3\2\2\2$%\7o\2\2%&\7g\2\2&\'\7n\2\2\'(\7q\2\2()\7f\2\2)*\7{\2"+
		"\2*\b\3\2\2\2+,\7\177\2\2,\n\3\2\2\2-.\7i\2\2./\7q\2\2/\f\3\2\2\2\60\63"+
		"\5\21\t\2\61\64\5\21\t\2\62\64\5\23\n\2\63\61\3\2\2\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\16\3\2\2\2\679\5\23\n\28\67"+
		"\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\20\3\2\2\2<=\t\2\2\2=\22\3\2\2"+
		"\2>?\t\3\2\2?\24\3\2\2\2@B\t\4\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\26\3\2\2\2EI\7%\2\2FH\13\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3"+
		"\2\2\2JL\3\2\2\2KI\3\2\2\2LM\t\5\2\2MN\3\2\2\2NO\b\f\2\2O\30\3\2\2\2P"+
		"Q\7\61\2\2QR\7,\2\2RV\3\2\2\2SU\13\2\2\2TS\3\2\2\2UX\3\2\2\2VW\3\2\2\2"+
		"VT\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7,\2\2Z[\7\61\2\2[\\\3\2\2\2\\]\b\r\3"+
		"\2]\32\3\2\2\2^`\t\6\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2cd\b\16\4\2d\34\3\2\2\2\n\2\63\65:CIVa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}