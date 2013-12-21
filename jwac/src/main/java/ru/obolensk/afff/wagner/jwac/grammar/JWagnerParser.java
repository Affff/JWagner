// Generated from JWagner.g4 by ANTLR 4.0

    package ru.obolensk.afff.wagner.jwac.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JWagnerParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'allegretto mosso'", "'vivace'", "'animato assai'", "'allegro moderato'", 
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
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_tune = 2, RULE_command = 3, 
		RULE_playNoteCmd = 4, RULE_goCmd = 5, RULE_tempoCmd = 6, RULE_emptyCmd = 7, 
		RULE_playNow = 8, RULE_play = 9, RULE_async = 10, RULE_noautofwd = 11, 
		RULE_note = 12, RULE_tactLenght = 13, RULE_tactLenghtPrefix = 14, RULE_tactLenghtValue = 15, 
		RULE_tactLenghtDot = 16, RULE_channel = 17, RULE_tempoValue = 18, RULE_tempoDigitValue = 19;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "tune", "command", "playNoteCmd", "goCmd", 
		"tempoCmd", "emptyCmd", "playNow", "play", "async", "noautofwd", "note", 
		"tactLenght", "tactLenghtPrefix", "tactLenghtValue", "tactLenghtDot", 
		"channel", "tempoValue", "tempoDigitValue"
	};

	@Override
	public String getGrammarFileName() { return "JWagner.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JWagnerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MelodyDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JWagnerParser.ID, 0); }
		public MelodyBodyContext melodyBody() {
			return getRuleContext(MelodyBodyContext.class,0);
		}
		public MelodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_melodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterMelodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitMelodyDeclaration(this);
		}
	}

	public final MelodyDeclarationContext melodyDeclaration() throws RecognitionException {
		MelodyDeclarationContext _localctx = new MelodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_melodyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(10);
			setState(41); match(ID);
			setState(42); melodyBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MelodyBodyContext extends ParserRuleContext {
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TuneContext tune(int i) {
			return getRuleContext(TuneContext.class,i);
		}
		public List<TuneContext> tune() {
			return getRuleContexts(TuneContext.class);
		}
		public MelodyBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_melodyBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterMelodyBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitMelodyBody(this);
		}
	}

	public final MelodyBodyContext melodyBody() throws RecognitionException {
		MelodyBodyContext _localctx = new MelodyBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_melodyBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(32);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 34) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << CMDEND))) != 0)) {
				{
				setState(47);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(45); command();
					}
					break;

				case 2:
					{
					setState(46); tune();
					}
					break;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); match(12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuneContext extends ParserRuleContext {
		public PlayNowContext playNow() {
			return getRuleContext(PlayNowContext.class,0);
		}
		public TerminalNode ID() { return getToken(JWagnerParser.ID, 0); }
		public TerminalNode CMDEND() { return getToken(JWagnerParser.CMDEND, 0); }
		public MelodyBodyContext melodyBody() {
			return getRuleContext(MelodyBodyContext.class,0);
		}
		public TuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTune(this);
		}
	}

	public final TuneContext tune() throws RecognitionException {
		TuneContext _localctx = new TuneContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tune);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(55);
				_la = _input.LA(1);
				if (_la==47) {
					{
					setState(54); playNow();
					}
				}

				setState(57); match(15);
				setState(58); match(ID);
				setState(59); melodyBody();
				}
				}
				break;

			case 2:
				{
				{
				setState(60); playNow();
				setState(61); match(15);
				setState(62); match(ID);
				setState(63); match(CMDEND);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public GoCmdContext goCmd() {
			return getRuleContext(GoCmdContext.class,0);
		}
		public TerminalNode CMDEND() { return getToken(JWagnerParser.CMDEND, 0); }
		public EmptyCmdContext emptyCmd() {
			return getRuleContext(EmptyCmdContext.class,0);
		}
		public TempoCmdContext tempoCmd() {
			return getRuleContext(TempoCmdContext.class,0);
		}
		public PlayNoteCmdContext playNoteCmd() {
			return getRuleContext(PlayNoteCmdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case 34:
			case 46:
			case 47:
			case 50:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(70);
				switch (_input.LA(1)) {
				case 47:
				case 50:
					{
					setState(67); playNoteCmd();
					}
					break;
				case 34:
					{
					setState(68); goCmd();
					}
					break;
				case 46:
					{
					setState(69); tempoCmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); match(CMDEND);
				}
				}
				break;
			case CMDEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); emptyCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayNoteCmdContext extends ParserRuleContext {
		public NoautofwdContext noautofwd() {
			return getRuleContext(NoautofwdContext.class,0);
		}
		public PlayContext play() {
			return getRuleContext(PlayContext.class,0);
		}
		public TactLenghtContext tactLenght() {
			return getRuleContext(TactLenghtContext.class,0);
		}
		public ChannelContext channel() {
			return getRuleContext(ChannelContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public PlayNoteCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playNoteCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterPlayNoteCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitPlayNoteCmd(this);
		}
	}

	public final PlayNoteCmdContext playNoteCmd() throws RecognitionException {
		PlayNoteCmdContext _localctx = new PlayNoteCmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_playNoteCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if (_la==50) {
				{
				setState(77); noautofwd();
				}
			}

			setState(80); play();
			setState(81); note();
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82); tactLenght();
				}
				break;
			}
			setState(86);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(85); channel();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoCmdContext extends ParserRuleContext {
		public TactLenghtContext tactLenght() {
			return getRuleContext(TactLenghtContext.class,0);
		}
		public GoCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterGoCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitGoCmd(this);
		}
	}

	public final GoCmdContext goCmd() throws RecognitionException {
		GoCmdContext _localctx = new GoCmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_goCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(34);
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 49) | (1L << INT))) != 0)) {
				{
				setState(89); tactLenght();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoCmdContext extends ParserRuleContext {
		public TempoValueContext tempoValue() {
			return getRuleContext(TempoValueContext.class,0);
		}
		public TempoCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempoCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTempoCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTempoCmd(this);
		}
	}

	public final TempoCmdContext tempoCmd() throws RecognitionException {
		TempoCmdContext _localctx = new TempoCmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tempoCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(46);
			setState(93); tempoValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyCmdContext extends ParserRuleContext {
		public TerminalNode CMDEND() { return getToken(JWagnerParser.CMDEND, 0); }
		public EmptyCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterEmptyCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitEmptyCmd(this);
		}
	}

	public final EmptyCmdContext emptyCmd() throws RecognitionException {
		EmptyCmdContext _localctx = new EmptyCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_emptyCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(CMDEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayNowContext extends ParserRuleContext {
		public PlayContext play() {
			return getRuleContext(PlayContext.class,0);
		}
		public AsyncContext async() {
			return getRuleContext(AsyncContext.class,0);
		}
		public PlayNowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playNow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterPlayNow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitPlayNow(this);
		}
	}

	public final PlayNowContext playNow() throws RecognitionException {
		PlayNowContext _localctx = new PlayNowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_playNow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); play();
			setState(99);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(98); async();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayContext extends ParserRuleContext {
		public PlayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterPlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitPlay(this);
		}
	}

	public final PlayContext play() throws RecognitionException {
		PlayContext _localctx = new PlayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_play);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsyncContext extends ParserRuleContext {
		public AsyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterAsync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitAsync(this);
		}
	}

	public final AsyncContext async() throws RecognitionException {
		AsyncContext _localctx = new AsyncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_async);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoautofwdContext extends ParserRuleContext {
		public NoautofwdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noautofwd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterNoautofwd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitNoautofwd(this);
		}
	}

	public final NoautofwdContext noautofwd() throws RecognitionException {
		NoautofwdContext _localctx = new NoautofwdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_noautofwd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(50);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(JWagnerParser.NOTE, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TactLenghtContext extends ParserRuleContext {
		public TactLenghtDotContext tactLenghtDot() {
			return getRuleContext(TactLenghtDotContext.class,0);
		}
		public TactLenghtValueContext tactLenghtValue() {
			return getRuleContext(TactLenghtValueContext.class,0);
		}
		public TactLenghtPrefixContext tactLenghtPrefix() {
			return getRuleContext(TactLenghtPrefixContext.class,0);
		}
		public TactLenghtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tactLenght; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTactLenght(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTactLenght(this);
		}
	}

	public final TactLenghtContext tactLenght() throws RecognitionException {
		TactLenghtContext _localctx = new TactLenghtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tactLenght);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if (_la==5 || _la==49) {
				{
				setState(109); tactLenghtPrefix();
				}
			}

			setState(112); tactLenghtValue();
			setState(114);
			_la = _input.LA(1);
			if (_la==36) {
				{
				setState(113); tactLenghtDot();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TactLenghtPrefixContext extends ParserRuleContext {
		public TactLenghtPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tactLenghtPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTactLenghtPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTactLenghtPrefix(this);
		}
	}

	public final TactLenghtPrefixContext tactLenghtPrefix() throws RecognitionException {
		TactLenghtPrefixContext _localctx = new TactLenghtPrefixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tactLenghtPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==5 || _la==49) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TactLenghtValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JWagnerParser.INT, 0); }
		public TactLenghtValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tactLenghtValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTactLenghtValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTactLenghtValue(this);
		}
	}

	public final TactLenghtValueContext tactLenghtValue() throws RecognitionException {
		TactLenghtValueContext _localctx = new TactLenghtValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tactLenghtValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TactLenghtDotContext extends ParserRuleContext {
		public TactLenghtDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tactLenghtDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTactLenghtDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTactLenghtDot(this);
		}
	}

	public final TactLenghtDotContext tactLenghtDot() throws RecognitionException {
		TactLenghtDotContext _localctx = new TactLenghtDotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tactLenghtDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChannelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JWagnerParser.INT, 0); }
		public ChannelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterChannel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitChannel(this);
		}
	}

	public final ChannelContext channel() throws RecognitionException {
		ChannelContext _localctx = new ChannelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_channel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoValueContext extends ParserRuleContext {
		public TempoDigitValueContext tempoDigitValue() {
			return getRuleContext(TempoDigitValueContext.class,0);
		}
		public TempoValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempoValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTempoValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTempoValue(this);
		}
	}

	public final TempoValueContext tempoValue() throws RecognitionException {
		TempoValueContext _localctx = new TempoValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tempoValue);
		int _la;
		try {
			setState(126);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 6:
			case 7:
			case 8:
			case 9:
			case 11:
			case 13:
			case 14:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 33:
			case 35:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 48:
			case 51:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 33) | (1L << 35) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 48) | (1L << 51))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); tempoDigitValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoDigitValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JWagnerParser.INT, 0); }
		public TempoDigitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempoDigitValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterTempoDigitValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitTempoDigitValue(this);
		}
	}

	public final TempoDigitValueContext tempoDigitValue() throws RecognitionException {
		TempoDigitValueContext _localctx = new TempoDigitValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tempoDigitValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3<\u0085\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\62\n\3\f\3\16\3\65\13\3\3\3\3\3\3\4\5\4:\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\5\5N\n"+
		"\5\3\6\5\6Q\n\6\3\6\3\6\3\6\5\6V\n\6\3\6\5\6Y\n\6\3\7\3\7\5\7]\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\5\nf\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\5\17q\n\17\3\17\3\17\5\17u\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\5\24\u0081\n\24\3\25\3\25\3\25\2\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\4\4\7\7\63\63\r\3\6\b\13\r\r\17\20\22"+
		"\32\34!##%%\'/\62\62\65\65\177\2*\3\2\2\2\4.\3\2\2\2\6C\3\2\2\2\bM\3\2"+
		"\2\2\nP\3\2\2\2\fZ\3\2\2\2\16^\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24g\3\2"+
		"\2\2\26i\3\2\2\2\30k\3\2\2\2\32m\3\2\2\2\34p\3\2\2\2\36v\3\2\2\2 x\3\2"+
		"\2\2\"z\3\2\2\2$|\3\2\2\2&\u0080\3\2\2\2(\u0082\3\2\2\2*+\7\f\2\2+,\7"+
		"8\2\2,-\5\4\3\2-\3\3\2\2\2.\63\7\"\2\2/\62\5\b\5\2\60\62\5\6\4\2\61/\3"+
		"\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3"+
		"\2\2\2\65\63\3\2\2\2\66\67\7\16\2\2\67\5\3\2\2\28:\5\22\n\298\3\2\2\2"+
		"9:\3\2\2\2:;\3\2\2\2;<\7\21\2\2<=\78\2\2=D\5\4\3\2>?\5\22\n\2?@\7\21\2"+
		"\2@A\78\2\2AB\79\2\2BD\3\2\2\2C9\3\2\2\2C>\3\2\2\2D\7\3\2\2\2EI\5\n\6"+
		"\2FI\5\f\7\2GI\5\16\b\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\79\2"+
		"\2KN\3\2\2\2LN\5\20\t\2MH\3\2\2\2ML\3\2\2\2N\t\3\2\2\2OQ\5\30\r\2PO\3"+
		"\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\24\13\2SU\5\32\16\2TV\5\34\17\2UT\3\2\2"+
		"\2UV\3\2\2\2VX\3\2\2\2WY\5$\23\2XW\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2Z\\\7"+
		"$\2\2[]\5\34\17\2\\[\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^_\7\60\2\2_`\5&\24"+
		"\2`\17\3\2\2\2ab\79\2\2b\21\3\2\2\2ce\5\24\13\2df\5\26\f\2ed\3\2\2\2e"+
		"f\3\2\2\2f\23\3\2\2\2gh\7\61\2\2h\25\3\2\2\2ij\7\33\2\2j\27\3\2\2\2kl"+
		"\7\64\2\2l\31\3\2\2\2mn\7\66\2\2n\33\3\2\2\2oq\5\36\20\2po\3\2\2\2pq\3"+
		"\2\2\2qr\3\2\2\2rt\5 \21\2su\5\"\22\2ts\3\2\2\2tu\3\2\2\2u\35\3\2\2\2"+
		"vw\t\2\2\2w\37\3\2\2\2xy\7\67\2\2y!\3\2\2\2z{\7&\2\2{#\3\2\2\2|}\7\67"+
		"\2\2}%\3\2\2\2~\u0081\t\3\2\2\177\u0081\5(\25\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\'\3\2\2\2\u0082\u0083\7\67\2\2\u0083)\3\2\2\2\20\61\63"+
		"9CHMPUX\\ept\u0080";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}