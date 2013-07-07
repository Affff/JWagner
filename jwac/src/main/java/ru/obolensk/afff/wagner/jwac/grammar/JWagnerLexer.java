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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, NOTE=8, TACTS=9, 
		NOTEKEY=10, DIEZ=11, OCTAVE=12, ID=13, INT=14, CMDEND=15, ROWCOMMENT=16, 
		BLOCKCOMMENT=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'tune'", "'play'", "'melody'", "'}'", "'go'", "'async'", "NOTE", 
		"TACTS", "NOTEKEY", "'#'", "OCTAVE", "ID", "INT", "CMDEND", "ROWCOMMENT", 
		"BLOCKCOMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NOTE", "TACTS", 
		"NOTEKEY", "DIEZ", "OCTAVE", "LETTER", "DIGIT", "ID", "INT", "CMDEND", 
		"ROWCOMMENT", "BLOCKCOMMENT", "WS"
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
		case 17: ROWCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\24\u008e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tL\n\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\6\20_\n"+
		"\20\r\20\16\20`\3\21\6\21d\n\21\r\21\16\21e\3\22\6\22i\n\22\r\22\16\22"+
		"j\3\23\3\23\3\23\3\23\7\23q\n\23\f\23\16\23t\13\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\7\24~\n\24\f\24\16\24\u0081\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\6\25\u0089\n\25\r\25\16\25\u008a\3\25\3\25\4r\177\26\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\2\1\35\2\1\37\17\1!\20\1#\21\1%\22\2\'\23\3)\24\4\3\2\7"+
		"\4C\\c|\3\62;\3==\4\f\f\17\17\5\13\f\17\17\"\"\u0093\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5-\3\2\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17C\3"+
		"\2\2\2\21I\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33"+
		"W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!c\3\2\2\2#h\3\2\2\2%l\3\2\2\2\'y\3\2"+
		"\2\2)\u0088\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7v\2\2./\7w\2\2/\60\7p\2\2\60"+
		"\61\7g\2\2\61\6\3\2\2\2\62\63\7r\2\2\63\64\7n\2\2\64\65\7c\2\2\65\66\7"+
		"{\2\2\66\b\3\2\2\2\678\7o\2\289\7g\2\29:\7n\2\2:;\7q\2\2;<\7f\2\2<=\7"+
		"{\2\2=\n\3\2\2\2>?\7\177\2\2?\f\3\2\2\2@A\7i\2\2AB\7q\2\2B\16\3\2\2\2"+
		"CD\7c\2\2DE\7u\2\2EF\7{\2\2FG\7p\2\2GH\7e\2\2H\20\3\2\2\2IK\5\25\13\2"+
		"JL\5\27\f\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\31\r\2N\22\3\2\2\2OP\5!"+
		"\21\2P\24\3\2\2\2QR\5\33\16\2R\26\3\2\2\2ST\7%\2\2T\30\3\2\2\2UV\5\35"+
		"\17\2V\32\3\2\2\2WX\t\2\2\2X\34\3\2\2\2YZ\t\3\2\2Z\36\3\2\2\2[^\5\33\16"+
		"\2\\_\5\33\16\2]_\5\35\17\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`"+
		"a\3\2\2\2a \3\2\2\2bd\5\35\17\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2"+
		"\2f\"\3\2\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k$\3\2"+
		"\2\2lm\7\61\2\2mn\7\61\2\2nr\3\2\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs"+
		"\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\t\5\2\2vw\3\2\2\2wx\b\23\2\2"+
		"x&\3\2\2\2yz\7\61\2\2z{\7,\2\2{\177\3\2\2\2|~\13\2\2\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7,\2\2\u0083\u0084\7\61\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\24\3\2\u0086(\3\2\2\2\u0087\u0089\t\6\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\b\25\4\2\u008d*\3\2\2\2\13\2K^`ejr\177\u008a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}