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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, ID=8, INT=9, LETTER=10, 
		DIGIT=11, CMDEND=12, ROWCOMMENT=13, BLOCKCOMMENT=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'mute'", "'tune'", "'play'", "'melody'", "'}'", "'go'", "ID", 
		"INT", "LETTER", "DIGIT", "CMDEND", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", "INT", "LETTER", 
		"DIGIT", "CMDEND", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
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
		case 12: ROWCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 13: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 14: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\21s\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\6\tB\n\t\r"+
		"\t\16\tC\3\n\6\nG\n\n\r\n\16\nH\3\13\3\13\3\f\3\f\3\r\6\rP\n\r\r\r\16"+
		"\rQ\3\16\3\16\7\16V\n\16\f\16\16\16Y\13\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\7\17c\n\17\f\17\16\17f\13\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\6\20n\n\20\r\20\16\20o\3\20\3\20\4Wd\21\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\2\35\20\3"+
		"\37\21\4\3\2\7\4C\\c|\3\62;\3==\4\f\f\17\17\5\13\f\17\17\"\"y\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7(\3"+
		"\2\2\2\t-\3\2\2\2\13\62\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21>\3\2\2\2\23"+
		"F\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31O\3\2\2\2\33S\3\2\2\2\35^\3\2\2\2"+
		"\37m\3\2\2\2!\"\7}\2\2\"\4\3\2\2\2#$\7o\2\2$%\7w\2\2%&\7v\2\2&\'\7g\2"+
		"\2\'\6\3\2\2\2()\7v\2\2)*\7w\2\2*+\7p\2\2+,\7g\2\2,\b\3\2\2\2-.\7r\2\2"+
		"./\7n\2\2/\60\7c\2\2\60\61\7{\2\2\61\n\3\2\2\2\62\63\7o\2\2\63\64\7g\2"+
		"\2\64\65\7n\2\2\65\66\7q\2\2\66\67\7f\2\2\678\7{\2\28\f\3\2\2\29:\7\177"+
		"\2\2:\16\3\2\2\2;<\7i\2\2<=\7q\2\2=\20\3\2\2\2>A\5\25\13\2?B\5\25\13\2"+
		"@B\5\27\f\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\22\3\2"+
		"\2\2EG\5\27\f\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\24\3\2\2\2JK"+
		"\t\2\2\2K\26\3\2\2\2LM\t\3\2\2M\30\3\2\2\2NP\t\4\2\2ON\3\2\2\2PQ\3\2\2"+
		"\2QO\3\2\2\2QR\3\2\2\2R\32\3\2\2\2SW\7%\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2"+
		"\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\t\5\2\2[\\\3\2\2\2\\]\b"+
		"\16\2\2]\34\3\2\2\2^_\7\61\2\2_`\7,\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2"+
		"cf\3\2\2\2de\3\2\2\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hi\7\61\2\2"+
		"ij\3\2\2\2jk\b\17\3\2k\36\3\2\2\2ln\t\6\2\2ml\3\2\2\2no\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pq\3\2\2\2qr\b\20\4\2r \3\2\2\2\n\2ACHQWdo";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}