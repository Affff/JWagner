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
		T__1=1, T__0=2, ID=3, INT=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'play'", "'melody'", "ID", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "ID", "INT", "WS"
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
		case 4: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\7*\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\33\n\4\r\4\16\4\34\3\5\6\5 \n\5"+
		"\r\5\16\5!\3\6\6\6%\n\6\r\6\16\6&\3\6\3\6\2\7\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\2\3\2\5\5\62;C\\c|\3\62;\5\13\f\17\17\"\",\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\22\3\2\2\2\7\32"+
		"\3\2\2\2\t\37\3\2\2\2\13$\3\2\2\2\r\16\7r\2\2\16\17\7n\2\2\17\20\7c\2"+
		"\2\20\21\7{\2\2\21\4\3\2\2\2\22\23\7o\2\2\23\24\7g\2\2\24\25\7n\2\2\25"+
		"\26\7q\2\2\26\27\7f\2\2\27\30\7{\2\2\30\6\3\2\2\2\31\33\t\2\2\2\32\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\b\3\2\2\2\36 \t"+
		"\3\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\n\3\2\2\2#%\t"+
		"\4\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\6\2\2)"+
		"\f\3\2\2\2\6\2\34!&";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}