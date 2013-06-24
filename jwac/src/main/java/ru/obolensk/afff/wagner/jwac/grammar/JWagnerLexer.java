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
		WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'play'", "'melody'", "'}'", "';'", "ID", "INT", "LETTER", "DIGIT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "ID", "INT", "LETTER", "DIGIT", 
		"WS"
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
		case 9: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\f@\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\6\7-\n\7\r\7\16\7.\3\b\6\b\62\n"+
		"\b\r\b\16\b\63\3\t\3\t\3\n\3\n\3\13\6\13;\n\13\r\13\16\13<\3\13\3\13\2"+
		"\f\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\2\3"+
		"\2\5\4C\\c|\3\62;\5\13\f\17\17\"\"C\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\36\3\2\2\2\t%\3\2\2"+
		"\2\13\'\3\2\2\2\r)\3\2\2\2\17\61\3\2\2\2\21\65\3\2\2\2\23\67\3\2\2\2\25"+
		":\3\2\2\2\27\30\7}\2\2\30\4\3\2\2\2\31\32\7r\2\2\32\33\7n\2\2\33\34\7"+
		"c\2\2\34\35\7{\2\2\35\6\3\2\2\2\36\37\7o\2\2\37 \7g\2\2 !\7n\2\2!\"\7"+
		"q\2\2\"#\7f\2\2#$\7{\2\2$\b\3\2\2\2%&\7\177\2\2&\n\3\2\2\2\'(\7=\2\2("+
		"\f\3\2\2\2),\5\21\t\2*-\5\21\t\2+-\5\23\n\2,*\3\2\2\2,+\3\2\2\2-.\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\16\3\2\2\2\60\62\5\23\n\2\61\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\20\3\2\2\2\65\66\t\2\2\2\66\22"+
		"\3\2\2\2\678\t\3\2\28\24\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=>\3\2\2\2>?\b\13\2\2?\26\3\2\2\2\7\2,.\63<";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}