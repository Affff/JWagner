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
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, NOTE=48, TACTS=49, NOTEKEY=50, DIEZ=51, OCTAVE=52, ID=53, 
		INT=54, CMDEND=55, ROWCOMMENT=56, BLOCKCOMMENT=57, WS=58, DIGIT=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'andante con moto'", "'allegretto mosso'", "'vivace'", "'grave'", 
		"'animato assai'", "'allegro moderato'", "'allegretto'", "'andante non troppo'", 
		"'prestissimo'", "'allegretto moderato'", "'presto'", "'comodamente'", 
		"'tempo di marcia'", "'{'", "'con moto'", "'allegro animato'", "'melody'", 
		"'}'", "'andantino'", "'go'", "'moderato assai'", "'larghetto'", "'andante assai'", 
		"'tune'", "'lentamente'", "'allegro assai'", "'animato'", "'adagietto'", 
		"'comodo'", "'lento'", "'allegro non troppo'", "'allegro agitato'", "'allegro tranquillo'", 
		"'allegro'", "'allegro molto'", "'andante mosso'", "'andante maestoso'", 
		"'moderato'", "'adagio'", "'tempo'", "'vivo'", "'andante'", "'play'", 
		"'largamente'", "'allegro vivace'", "'async'", "'largo'", "NOTE", "TACTS", 
		"NOTEKEY", "'#'", "OCTAVE", "ID", "INT", "CMDEND", "ROWCOMMENT", "BLOCKCOMMENT", 
		"WS", "DIGIT"
	};
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_tune = 2, RULE_command = 3, 
		RULE_playNoteCmd = 4, RULE_goCmd = 5, RULE_tempoCmd = 6, RULE_playNow = 7, 
		RULE_play = 8, RULE_async = 9, RULE_note = 10, RULE_tactLenght = 11, RULE_channel = 12, 
		RULE_tempoValue = 13, RULE_digitalTempo = 14;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "tune", "command", "playNoteCmd", "goCmd", 
		"tempoCmd", "playNow", "play", "async", "note", "tactLenght", "channel", 
		"tempoValue", "digitalTempo"
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
			setState(30); match(17);
			setState(31); match(ID);
			setState(32); melodyBody();
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
			setState(34); match(14);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 20) | (1L << 24) | (1L << 40) | (1L << 43))) != 0)) {
				{
				setState(37);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(35); command();
					}
					break;

				case 2:
					{
					setState(36); tune();
					}
					break;
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); match(18);
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
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(45);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(44); playNow();
					}
				}

				setState(47); match(24);
				setState(48); match(ID);
				setState(49); melodyBody();
				}
				}
				break;

			case 2:
				{
				{
				setState(50); playNow();
				setState(51); match(24);
				setState(52); match(ID);
				setState(53); match(CMDEND);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch (_input.LA(1)) {
			case 43:
				{
				setState(57); playNoteCmd();
				}
				break;
			case 20:
				{
				setState(58); goCmd();
				}
				break;
			case 40:
				{
				setState(59); tempoCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(62); match(CMDEND);
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
			setState(64); play();
			setState(65); note();
			setState(67);
			_la = _input.LA(1);
			if (_la==TACTS) {
				{
				setState(66); tactLenght();
				}
			}

			setState(70);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(69); channel();
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
			setState(72); match(20);
			setState(74);
			_la = _input.LA(1);
			if (_la==TACTS) {
				{
				setState(73); tactLenght();
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
			setState(76); match(40);
			setState(77); tempoValue();
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
		enterRule(_localctx, 14, RULE_playNow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); play();
			setState(81);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(80); async();
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
		enterRule(_localctx, 16, RULE_play);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(43);
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
		enterRule(_localctx, 18, RULE_async);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(46);
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
		enterRule(_localctx, 20, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(NOTE);
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
		public TerminalNode TACTS() { return getToken(JWagnerParser.TACTS, 0); }
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
		enterRule(_localctx, 22, RULE_tactLenght);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(TACTS);
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
		enterRule(_localctx, 24, RULE_channel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(INT);
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
		enterRule(_localctx, 26, RULE_tempoValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47))) != 0)) ) {
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

	public static class DigitalTempoContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(JWagnerParser.DIGIT, 0); }
		public DigitalTempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitalTempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterDigitalTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitDigitalTempo(this);
		}
	}

	public final DigitalTempoContext digitalTempo() throws RecognitionException {
		DigitalTempoContext _localctx = new DigitalTempoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_digitalTempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(DIGIT);
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
		"\2\3=d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\5\4\60\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\5\5?\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6F\n\6\3\6\5\6I\n\6\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\t\3"+
		"\t\5\tT\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\n\3\17\21\22"+
		"\25\25\27\31\33)+,./\61\61^\2 \3\2\2\2\4$\3\2\2\2\69\3\2\2\2\b>\3\2\2"+
		"\2\nB\3\2\2\2\fJ\3\2\2\2\16N\3\2\2\2\20Q\3\2\2\2\22U\3\2\2\2\24W\3\2\2"+
		"\2\26Y\3\2\2\2\30[\3\2\2\2\32]\3\2\2\2\34_\3\2\2\2\36a\3\2\2\2 !\7\23"+
		"\2\2!\"\7\67\2\2\"#\5\4\3\2#\3\3\2\2\2$)\7\20\2\2%(\5\b\5\2&(\5\6\4\2"+
		"\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2"+
		"\2\2,-\7\24\2\2-\5\3\2\2\2.\60\5\20\t\2/.\3\2\2\2/\60\3\2\2\2\60\61\3"+
		"\2\2\2\61\62\7\32\2\2\62\63\7\67\2\2\63:\5\4\3\2\64\65\5\20\t\2\65\66"+
		"\7\32\2\2\66\67\7\67\2\2\678\79\2\28:\3\2\2\29/\3\2\2\29\64\3\2\2\2:\7"+
		"\3\2\2\2;?\5\n\6\2<?\5\f\7\2=?\5\16\b\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2"+
		"?@\3\2\2\2@A\79\2\2A\t\3\2\2\2BC\5\22\n\2CE\5\26\f\2DF\5\30\r\2ED\3\2"+
		"\2\2EF\3\2\2\2FH\3\2\2\2GI\5\32\16\2HG\3\2\2\2HI\3\2\2\2I\13\3\2\2\2J"+
		"L\7\26\2\2KM\5\30\r\2LK\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NO\7*\2\2OP\5\34\17"+
		"\2P\17\3\2\2\2QS\5\22\n\2RT\5\24\13\2SR\3\2\2\2ST\3\2\2\2T\21\3\2\2\2"+
		"UV\7-\2\2V\23\3\2\2\2WX\7\60\2\2X\25\3\2\2\2YZ\7\62\2\2Z\27\3\2\2\2[\\"+
		"\7\63\2\2\\\31\3\2\2\2]^\78\2\2^\33\3\2\2\2_`\t\2\2\2`\35\3\2\2\2ab\7"+
		"=\2\2b\37\3\2\2\2\13\')/9>EHLS";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}