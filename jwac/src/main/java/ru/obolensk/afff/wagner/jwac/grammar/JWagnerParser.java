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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NOTE=7, TACTS=8, NOTEKEY=9, 
		DIEZ=10, OCTAVE=11, ID=12, INT=13, CMDEND=14, ROWCOMMENT=15, BLOCKCOMMENT=16, 
		WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'tune'", "'play'", "'melody'", "'}'", "'go'", "NOTE", 
		"TACTS", "NOTEKEY", "'#'", "OCTAVE", "ID", "INT", "CMDEND", "ROWCOMMENT", 
		"BLOCKCOMMENT", "WS"
	};
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_tune = 2, RULE_command = 3, 
		RULE_playNoteCmd = 4, RULE_goCmd = 5, RULE_playNow = 6, RULE_note = 7, 
		RULE_tactLenght = 8, RULE_channel = 9;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "tune", "command", "playNoteCmd", "goCmd", 
		"playNow", "note", "tactLenght", "channel"
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
			setState(20); match(4);
			setState(21); match(ID);
			setState(22); melodyBody();
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
			setState(24); match(1);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 6))) != 0)) {
				{
				setState(27);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(25); command();
					}
					break;

				case 2:
					{
					setState(26); tune();
					}
					break;
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); match(5);
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
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(35);
				_la = _input.LA(1);
				if (_la==3) {
					{
					setState(34); playNow();
					}
				}

				setState(37); match(2);
				setState(38); match(ID);
				setState(39); melodyBody();
				}
				}
				break;

			case 2:
				{
				{
				setState(40); playNow();
				setState(41); match(2);
				setState(42); match(ID);
				setState(43); match(CMDEND);
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
			setState(49);
			switch (_input.LA(1)) {
			case 3:
				{
				setState(47); playNoteCmd();
				}
				break;
			case 6:
				{
				setState(48); goCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(51); match(CMDEND);
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
			setState(53); match(3);
			setState(54); note();
			setState(56);
			_la = _input.LA(1);
			if (_la==TACTS) {
				{
				setState(55); tactLenght();
				}
			}

			setState(59);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(58); channel();
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
			setState(61); match(6);
			setState(63);
			_la = _input.LA(1);
			if (_la==TACTS) {
				{
				setState(62); tactLenght();
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

	public static class PlayNowContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_playNow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(3);
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
		enterRule(_localctx, 14, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(NOTE);
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
		enterRule(_localctx, 16, RULE_tactLenght);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(TACTS);
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
		enterRule(_localctx, 18, RULE_channel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(INT);
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
		"\2\3\23L\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!"+
		"\13\3\3\3\3\3\3\4\5\4&\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4"+
		"\3\5\3\5\5\5\64\n\5\3\5\3\5\3\6\3\6\3\6\5\6;\n\6\3\6\5\6>\n\6\3\7\3\7"+
		"\5\7B\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\2I\2\26\3\2\2\2\4\32\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n\67\3\2"+
		"\2\2\f?\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22G\3\2\2\2\24I\3\2\2\2\26\27"+
		"\7\6\2\2\27\30\7\16\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\37\7\3\2\2\33\36"+
		"\5\b\5\2\34\36\5\6\4\2\35\33\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3"+
		"\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\7\2\2#\5\3\2\2\2$&\5\16"+
		"\b\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\4\2\2()\7\16\2\2)\60\5\4\3\2"+
		"*+\5\16\b\2+,\7\4\2\2,-\7\16\2\2-.\7\20\2\2.\60\3\2\2\2/%\3\2\2\2/*\3"+
		"\2\2\2\60\7\3\2\2\2\61\64\5\n\6\2\62\64\5\f\7\2\63\61\3\2\2\2\63\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\66\7\20\2\2\66\t\3\2\2\2\678\7\5\2\28:\5\20\t"+
		"\29;\5\22\n\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\24\13\2=<\3\2\2\2=>\3"+
		"\2\2\2>\13\3\2\2\2?A\7\b\2\2@B\5\22\n\2A@\3\2\2\2AB\3\2\2\2B\r\3\2\2\2"+
		"CD\7\5\2\2D\17\3\2\2\2EF\7\t\2\2F\21\3\2\2\2GH\7\n\2\2H\23\3\2\2\2IJ\7"+
		"\17\2\2J\25\3\2\2\2\n\35\37%/\63:=A";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}