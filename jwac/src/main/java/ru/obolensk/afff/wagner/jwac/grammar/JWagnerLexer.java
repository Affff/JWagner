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
		T__50=1, T__49=2, T__48=3, T__47=4, T__46=5, T__45=6, T__44=7, T__43=8, 
		T__42=9, T__41=10, T__40=11, T__39=12, T__38=13, T__37=14, T__36=15, T__35=16, 
		T__34=17, T__33=18, T__32=19, T__31=20, T__30=21, T__29=22, T__28=23, 
		T__27=24, T__26=25, T__25=26, T__24=27, T__23=28, T__22=29, T__21=30, 
		T__20=31, T__19=32, T__18=33, T__17=34, T__16=35, T__15=36, T__14=37, 
		T__13=38, T__12=39, T__11=40, T__10=41, T__9=42, T__8=43, T__7=44, T__6=45, 
		T__5=46, T__4=47, T__3=48, T__2=49, T__1=50, T__0=51, NOTE=52, INT=53, 
		ID=54, CMDEND=55, ROWCOMMENT=56, BLOCKCOMMENT=57, WS=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'allegretto mosso'", "'vivace'", "'animato assai'", "'allegro moderato'", 
		"'*'", "'allegretto'", "'prestissimo'", "'presto'", "'con moto'", "'melody'", 
		"'andantino'", "'}'", "'moderato assai'", "'andante assai'", "'tune'", 
		"'lentamente'", "'animato'", "'adagietto'", "'allegro agitato'", "'lento'", 
		"'allegro'", "'allegro tranquillo'", "'andante'", "'allegro vivace'", 
		"'async'", "'andante con moto'", "'grave'", "'andante non troppo'", "'allegretto moderato'", 
		"'tempo di marcia'", "'comodamente'", "'{'", "'allegro animato'", "'go'", 
		"'larghetto'", "'.'", "'allegro assai'", "'allegro non troppo'", "'comodo'", 
		"'allegro molto'", "'andante maestoso'", "'andante mosso'", "'moderato'", 
		"'adagio'", "'vivo'", "'tempo'", "'play'", "'largamente'", "'/'", "'~'", 
		"'largo'", "NOTE", "INT", "ID", "';'", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__50", "T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", 
		"T__42", "T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", 
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "NOTE", "NOTEKEY", "DIEZ", "OCTAVE", "LETTER", "DIGIT", 
		"INT", "ID", "CMDEND", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
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
		case 60: ROWCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 61: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 62: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4<\u02c6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\5\65\u0289\n\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\3"+
		"9\39\3:\3:\3;\6;\u0298\n;\r;\16;\u0299\3<\3<\3<\6<\u029f\n<\r<\16<\u02a0"+
		"\3=\3=\3>\3>\3>\3>\7>\u02a9\n>\f>\16>\u02ac\13>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\7?\u02b6\n?\f?\16?\u02b9\13?\3?\3?\3?\3?\3?\3@\6@\u02c1\n@\r@\16@\u02c2"+
		"\3@\3@\4\u02aa\u02b7A\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1"+
		"Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\2\1m\2\1o\2\1q\2\1"+
		"s\2\1u\67\1w8\1y9\1{:\2};\3\177<\4\3\2\6\4C\\c|\3\62;\4\f\f\17\17\5\13"+
		"\f\17\17\"\"\u02c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081"+
		"\3\2\2\2\5\u0092\3\2\2\2\7\u0099\3\2\2\2\t\u00a7\3\2\2\2\13\u00b8\3\2"+
		"\2\2\r\u00ba\3\2\2\2\17\u00c5\3\2\2\2\21\u00d1\3\2\2\2\23\u00d8\3\2\2"+
		"\2\25\u00e1\3\2\2\2\27\u00e8\3\2\2\2\31\u00f2\3\2\2\2\33\u00f4\3\2\2\2"+
		"\35\u0103\3\2\2\2\37\u0111\3\2\2\2!\u0116\3\2\2\2#\u0121\3\2\2\2%\u0129"+
		"\3\2\2\2\'\u0133\3\2\2\2)\u0143\3\2\2\2+\u0149\3\2\2\2-\u0151\3\2\2\2"+
		"/\u0164\3\2\2\2\61\u016c\3\2\2\2\63\u017b\3\2\2\2\65\u0181\3\2\2\2\67"+
		"\u0192\3\2\2\29\u0198\3\2\2\2;\u01ab\3\2\2\2=\u01bf\3\2\2\2?\u01cf\3\2"+
		"\2\2A\u01db\3\2\2\2C\u01dd\3\2\2\2E\u01ed\3\2\2\2G\u01f0\3\2\2\2I\u01fa"+
		"\3\2\2\2K\u01fc\3\2\2\2M\u020a\3\2\2\2O\u021d\3\2\2\2Q\u0224\3\2\2\2S"+
		"\u0232\3\2\2\2U\u0243\3\2\2\2W\u0251\3\2\2\2Y\u025a\3\2\2\2[\u0261\3\2"+
		"\2\2]\u0266\3\2\2\2_\u026c\3\2\2\2a\u0271\3\2\2\2c\u027c\3\2\2\2e\u027e"+
		"\3\2\2\2g\u0280\3\2\2\2i\u0286\3\2\2\2k\u028c\3\2\2\2m\u028e\3\2\2\2o"+
		"\u0290\3\2\2\2q\u0292\3\2\2\2s\u0294\3\2\2\2u\u0297\3\2\2\2w\u029b\3\2"+
		"\2\2y\u02a2\3\2\2\2{\u02a4\3\2\2\2}\u02b1\3\2\2\2\177\u02c0\3\2\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7n\2\2\u0084\u0085\7g\2\2"+
		"\u0085\u0086\7i\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7v\2\2\u0089\u008a\7v\2\2\u008a\u008b\7q\2\2\u008b\u008c\7\"\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7q\2\2\u008e\u008f\7u\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7q\2\2\u0091\4\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094\7k"+
		"\2\2\u0094\u0095\7x\2\2\u0095\u0096\7c\2\2\u0096\u0097\7e\2\2\u0097\u0098"+
		"\7g\2\2\u0098\6\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7o\2\2\u009d\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2"+
		"\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7k\2\2\u00a6\b\3"+
		"\2\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\u00af\7\"\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2"+
		"\7f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7q\2\2\u00b7\n\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\f\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7q\2\2\u00c4\16\3\2"+
		"\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7q\2\2"+
		"\u00d0\20\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7"+
		"g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7q\2\2\u00d7\22"+
		"\3\2\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7\"\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7v\2"+
		"\2\u00df\u00e0\7q\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7f\2\2\u00e6"+
		"\u00e7\7{\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\u00eb\7f\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7q\2\2\u00f1\30\3\2"+
		"\2\2\u00f2\u00f3\7\177\2\2\u00f3\32\3\2\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7\"\2"+
		"\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7u\2\2\u0100\u0101"+
		"\7c\2\2\u0101\u0102\7k\2\2\u0102\34\3\2\2\2\u0103\u0104\7c\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7f\2\2\u0106\u0107\7c\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7c\2"+
		"\2\u010c\u010d\7u\2\2\u010d\u010e\7u\2\2\u010e\u010f\7c\2\2\u010f\u0110"+
		"\7k\2\2\u0110\36\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7w\2\2\u0113\u0114"+
		"\7p\2\2\u0114\u0115\7g\2\2\u0115 \3\2\2\2\u0116\u0117\7n\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p\2\2\u011e\u011f\7v\2\2"+
		"\u011f\u0120\7g\2\2\u0120\"\3\2\2\2\u0121\u0122\7c\2\2\u0122\u0123\7p"+
		"\2\2\u0123\u0124\7k\2\2\u0124\u0125\7o\2\2\u0125\u0126\7c\2\2\u0126\u0127"+
		"\7v\2\2\u0127\u0128\7q\2\2\u0128$\3\2\2\2\u0129\u012a\7c\2\2\u012a\u012b"+
		"\7f\2\2\u012b\u012c\7c\2\2\u012c\u012d\7i\2\2\u012d\u012e\7k\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130\u0131\7v\2\2\u0131\u0132\7q\2\2"+
		"\u0132&\3\2\2\2\u0133\u0134\7c\2\2\u0134\u0135\7n\2\2\u0135\u0136\7n\2"+
		"\2\u0136\u0137\7g\2\2\u0137\u0138\7i\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\7q\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7c\2\2\u013c\u013d\7i\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7v\2\2\u013f\u0140\7c\2\2\u0140\u0141\7v\2\2"+
		"\u0141\u0142\7q\2\2\u0142(\3\2\2\2\u0143\u0144\7n\2\2\u0144\u0145\7g\2"+
		"\2\u0145\u0146\7p\2\2\u0146\u0147\7v\2\2\u0147\u0148\7q\2\2\u0148*\3\2"+
		"\2\2\u0149\u014a\7c\2\2\u014a\u014b\7n\2\2\u014b\u014c\7n\2\2\u014c\u014d"+
		"\7g\2\2\u014d\u014e\7i\2\2\u014e\u014f\7t\2\2\u014f\u0150\7q\2\2\u0150"+
		",\3\2\2\2\u0151\u0152\7c\2\2\u0152\u0153\7n\2\2\u0153\u0154\7n\2\2\u0154"+
		"\u0155\7g\2\2\u0155\u0156\7i\2\2\u0156\u0157\7t\2\2\u0157\u0158\7q\2\2"+
		"\u0158\u0159\7\"\2\2\u0159\u015a\7v\2\2\u015a\u015b\7t\2\2\u015b\u015c"+
		"\7c\2\2\u015c\u015d\7p\2\2\u015d\u015e\7s\2\2\u015e\u015f\7w\2\2\u015f"+
		"\u0160\7k\2\2\u0160\u0161\7n\2\2\u0161\u0162\7n\2\2\u0162\u0163\7q\2\2"+
		"\u0163.\3\2\2\2\u0164\u0165\7c\2\2\u0165\u0166\7p\2\2\u0166\u0167\7f\2"+
		"\2\u0167\u0168\7c\2\2\u0168\u0169\7p\2\2\u0169\u016a\7v\2\2\u016a\u016b"+
		"\7g\2\2\u016b\60\3\2\2\2\u016c\u016d\7c\2\2\u016d\u016e\7n\2\2\u016e\u016f"+
		"\7n\2\2\u016f\u0170\7g\2\2\u0170\u0171\7i\2\2\u0171\u0172\7t\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7\"\2\2\u0174\u0175\7x\2\2\u0175\u0176\7k\2"+
		"\2\u0176\u0177\7x\2\2\u0177\u0178\7c\2\2\u0178\u0179\7e\2\2\u0179\u017a"+
		"\7g\2\2\u017a\62\3\2\2\2\u017b\u017c\7c\2\2\u017c\u017d\7u\2\2\u017d\u017e"+
		"\7{\2\2\u017e\u017f\7p\2\2\u017f\u0180\7e\2\2\u0180\64\3\2\2\2\u0181\u0182"+
		"\7c\2\2\u0182\u0183\7p\2\2\u0183\u0184\7f\2\2\u0184\u0185\7c\2\2\u0185"+
		"\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187\u0188\7g\2\2\u0188\u0189\7\"\2"+
		"\2\u0189\u018a\7e\2\2\u018a\u018b\7q\2\2\u018b\u018c\7p\2\2\u018c\u018d"+
		"\7\"\2\2\u018d\u018e\7o\2\2\u018e\u018f\7q\2\2\u018f\u0190\7v\2\2\u0190"+
		"\u0191\7q\2\2\u0191\66\3\2\2\2\u0192\u0193\7i\2\2\u0193\u0194\7t\2\2\u0194"+
		"\u0195\7c\2\2\u0195\u0196\7x\2\2\u0196\u0197\7g\2\2\u01978\3\2\2\2\u0198"+
		"\u0199\7c\2\2\u0199\u019a\7p\2\2\u019a\u019b\7f\2\2\u019b\u019c\7c\2\2"+
		"\u019c\u019d\7p\2\2\u019d\u019e\7v\2\2\u019e\u019f\7g\2\2\u019f\u01a0"+
		"\7\"\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7p\2\2\u01a3"+
		"\u01a4\7\"\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7q\2"+
		"\2\u01a7\u01a8\7r\2\2\u01a8\u01a9\7r\2\2\u01a9\u01aa\7q\2\2\u01aa:\3\2"+
		"\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af"+
		"\7g\2\2\u01af\u01b0\7i\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7g\2\2\u01b2"+
		"\u01b3\7v\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7\"\2"+
		"\2\u01b6\u01b7\7o\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7f\2\2\u01b9\u01ba"+
		"\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7v\2\2\u01bd"+
		"\u01be\7q\2\2\u01be<\3\2\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7g\2\2\u01c1"+
		"\u01c2\7o\2\2\u01c2\u01c3\7r\2\2\u01c3\u01c4\7q\2\2\u01c4\u01c5\7\"\2"+
		"\2\u01c5\u01c6\7f\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7\"\2\2\u01c8\u01c9"+
		"\7o\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7e\2\2\u01cc"+
		"\u01cd\7k\2\2\u01cd\u01ce\7c\2\2\u01ce>\3\2\2\2\u01cf\u01d0\7e\2\2\u01d0"+
		"\u01d1\7q\2\2\u01d1\u01d2\7o\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7f\2\2"+
		"\u01d4\u01d5\7c\2\2\u01d5\u01d6\7o\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8"+
		"\7p\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7g\2\2\u01da@\3\2\2\2\u01db\u01dc"+
		"\7}\2\2\u01dcB\3\2\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7n\2\2\u01df\u01e0"+
		"\7n\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7i\2\2\u01e2\u01e3\7t\2\2\u01e3"+
		"\u01e4\7q\2\2\u01e4\u01e5\7\"\2\2\u01e5\u01e6\7c\2\2\u01e6\u01e7\7p\2"+
		"\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7o\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb"+
		"\7v\2\2\u01eb\u01ec\7q\2\2\u01ecD\3\2\2\2\u01ed\u01ee\7i\2\2\u01ee\u01ef"+
		"\7q\2\2\u01efF\3\2\2\2\u01f0\u01f1\7n\2\2\u01f1\u01f2\7c\2\2\u01f2\u01f3"+
		"\7t\2\2\u01f3\u01f4\7i\2\2\u01f4\u01f5\7j\2\2\u01f5\u01f6\7g\2\2\u01f6"+
		"\u01f7\7v\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7q\2\2\u01f9H\3\2\2\2\u01fa"+
		"\u01fb\7\60\2\2\u01fbJ\3\2\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7n\2\2\u01fe"+
		"\u01ff\7n\2\2\u01ff\u0200\7g\2\2\u0200\u0201\7i\2\2\u0201\u0202\7t\2\2"+
		"\u0202\u0203\7q\2\2\u0203\u0204\7\"\2\2\u0204\u0205\7c\2\2\u0205\u0206"+
		"\7u\2\2\u0206\u0207\7u\2\2\u0207\u0208\7c\2\2\u0208\u0209\7k\2\2\u0209"+
		"L\3\2\2\2\u020a\u020b\7c\2\2\u020b\u020c\7n\2\2\u020c\u020d\7n\2\2\u020d"+
		"\u020e\7g\2\2\u020e\u020f\7i\2\2\u020f\u0210\7t\2\2\u0210\u0211\7q\2\2"+
		"\u0211\u0212\7\"\2\2\u0212\u0213\7p\2\2\u0213\u0214\7q\2\2\u0214\u0215"+
		"\7p\2\2\u0215\u0216\7\"\2\2\u0216\u0217\7v\2\2\u0217\u0218\7t\2\2\u0218"+
		"\u0219\7q\2\2\u0219\u021a\7r\2\2\u021a\u021b\7r\2\2\u021b\u021c\7q\2\2"+
		"\u021cN\3\2\2\2\u021d\u021e\7e\2\2\u021e\u021f\7q\2\2\u021f\u0220\7o\2"+
		"\2\u0220\u0221\7q\2\2\u0221\u0222\7f\2\2\u0222\u0223\7q\2\2\u0223P\3\2"+
		"\2\2\u0224\u0225\7c\2\2\u0225\u0226\7n\2\2\u0226\u0227\7n\2\2\u0227\u0228"+
		"\7g\2\2\u0228\u0229\7i\2\2\u0229\u022a\7t\2\2\u022a\u022b\7q\2\2\u022b"+
		"\u022c\7\"\2\2\u022c\u022d\7o\2\2\u022d\u022e\7q\2\2\u022e\u022f\7n\2"+
		"\2\u022f\u0230\7v\2\2\u0230\u0231\7q\2\2\u0231R\3\2\2\2\u0232\u0233\7"+
		"c\2\2\u0233\u0234\7p\2\2\u0234\u0235\7f\2\2\u0235\u0236\7c\2\2\u0236\u0237"+
		"\7p\2\2\u0237\u0238\7v\2\2\u0238\u0239\7g\2\2\u0239\u023a\7\"\2\2\u023a"+
		"\u023b\7o\2\2\u023b\u023c\7c\2\2\u023c\u023d\7g\2\2\u023d\u023e\7u\2\2"+
		"\u023e\u023f\7v\2\2\u023f\u0240\7q\2\2\u0240\u0241\7u\2\2\u0241\u0242"+
		"\7q\2\2\u0242T\3\2\2\2\u0243\u0244\7c\2\2\u0244\u0245\7p\2\2\u0245\u0246"+
		"\7f\2\2\u0246\u0247\7c\2\2\u0247\u0248\7p\2\2\u0248\u0249\7v\2\2\u0249"+
		"\u024a\7g\2\2\u024a\u024b\7\"\2\2\u024b\u024c\7o\2\2\u024c\u024d\7q\2"+
		"\2\u024d\u024e\7u\2\2\u024e\u024f\7u\2\2\u024f\u0250\7q\2\2\u0250V\3\2"+
		"\2\2\u0251\u0252\7o\2\2\u0252\u0253\7q\2\2\u0253\u0254\7f\2\2\u0254\u0255"+
		"\7g\2\2\u0255\u0256\7t\2\2\u0256\u0257\7c\2\2\u0257\u0258\7v\2\2\u0258"+
		"\u0259\7q\2\2\u0259X\3\2\2\2\u025a\u025b\7c\2\2\u025b\u025c\7f\2\2\u025c"+
		"\u025d\7c\2\2\u025d\u025e\7i\2\2\u025e\u025f\7k\2\2\u025f\u0260\7q\2\2"+
		"\u0260Z\3\2\2\2\u0261\u0262\7x\2\2\u0262\u0263\7k\2\2\u0263\u0264\7x\2"+
		"\2\u0264\u0265\7q\2\2\u0265\\\3\2\2\2\u0266\u0267\7v\2\2\u0267\u0268\7"+
		"g\2\2\u0268\u0269\7o\2\2\u0269\u026a\7r\2\2\u026a\u026b\7q\2\2\u026b^"+
		"\3\2\2\2\u026c\u026d\7r\2\2\u026d\u026e\7n\2\2\u026e\u026f\7c\2\2\u026f"+
		"\u0270\7{\2\2\u0270`\3\2\2\2\u0271\u0272\7n\2\2\u0272\u0273\7c\2\2\u0273"+
		"\u0274\7t\2\2\u0274\u0275\7i\2\2\u0275\u0276\7c\2\2\u0276\u0277\7o\2\2"+
		"\u0277\u0278\7g\2\2\u0278\u0279\7p\2\2\u0279\u027a\7v\2\2\u027a\u027b"+
		"\7g\2\2\u027bb\3\2\2\2\u027c\u027d\7\61\2\2\u027dd\3\2\2\2\u027e\u027f"+
		"\7\u0080\2\2\u027ff\3\2\2\2\u0280\u0281\7n\2\2\u0281\u0282\7c\2\2\u0282"+
		"\u0283\7t\2\2\u0283\u0284\7i\2\2\u0284\u0285\7q\2\2\u0285h\3\2\2\2\u0286"+
		"\u0288\5k\66\2\u0287\u0289\5m\67\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289\u028a\3\2\2\2\u028a\u028b\5o8\2\u028bj\3\2\2\2\u028c\u028d"+
		"\5q9\2\u028dl\3\2\2\2\u028e\u028f\5q9\2\u028fn\3\2\2\2\u0290\u0291\5s"+
		":\2\u0291p\3\2\2\2\u0292\u0293\t\2\2\2\u0293r\3\2\2\2\u0294\u0295\t\3"+
		"\2\2\u0295t\3\2\2\2\u0296\u0298\5s:\2\u0297\u0296\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029av\3\2\2\2\u029b"+
		"\u029e\5q9\2\u029c\u029f\5q9\2\u029d\u029f\5s:\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1x\3\2\2\2\u02a2\u02a3\7=\2\2\u02a3z\3\2\2\2\u02a4\u02a5\7\61"+
		"\2\2\u02a5\u02a6\7\61\2\2\u02a6\u02aa\3\2\2\2\u02a7\u02a9\13\2\2\2\u02a8"+
		"\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02ab\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\t\4\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\b>\2\2\u02b0|\3\2\2\2\u02b1\u02b2\7\61\2\2"+
		"\u02b2\u02b3\7,\2\2\u02b3\u02b7\3\2\2\2\u02b4\u02b6\13\2\2\2\u02b5\u02b4"+
		"\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7,\2\2\u02bb\u02bc\7\61"+
		"\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\b?\3\2\u02be~\3\2\2\2\u02bf\u02c1"+
		"\t\5\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\b@\4\2\u02c5\u0080\3\2"+
		"\2\2\n\2\u0288\u0299\u029e\u02a0\u02aa\u02b7\u02c2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}