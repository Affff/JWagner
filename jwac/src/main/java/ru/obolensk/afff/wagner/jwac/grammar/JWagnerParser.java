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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, ID=8, INT=9, LETTER=10, 
		DIGIT=11, CMDEND=12, ROWCOMMENT=13, BLOCKCOMMENT=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'mute'", "'tune'", "'play'", "'melody'", "'}'", "'go'", 
		"ID", "INT", "LETTER", "DIGIT", "CMDEND", "ROWCOMMENT", "BLOCKCOMMENT", 
		"WS"
	};
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_tune = 2, RULE_mute = 3, 
		RULE_command = 4, RULE_playNoteCmd = 5, RULE_goCmd = 6;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "tune", "mute", "command", "playNoteCmd", 
		"goCmd"
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
			setState(14); match(5);
			setState(15); match(ID);
			setState(16); melodyBody();
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
			setState(18); match(1);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 7))) != 0)) {
				{
				setState(21);
				switch (_input.LA(1)) {
				case 4:
				case 7:
					{
					setState(19); command();
					}
					break;
				case 2:
				case 3:
					{
					setState(20); tune();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); match(6);
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
		public TerminalNode ID() { return getToken(JWagnerParser.ID, 0); }
		public TerminalNode CMDEND() { return getToken(JWagnerParser.CMDEND, 0); }
		public MelodyBodyContext melodyBody() {
			return getRuleContext(MelodyBodyContext.class,0);
		}
		public MuteContext mute() {
			return getRuleContext(MuteContext.class,0);
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
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(29);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(28); mute();
					}
				}

				setState(31); match(3);
				setState(32); match(ID);
				setState(33); melodyBody();
				}
				}
				break;

			case 2:
				{
				{
				setState(34); match(3);
				setState(35); match(ID);
				setState(36); match(CMDEND);
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

	public static class MuteContext extends ParserRuleContext {
		public MuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterMute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitMute(this);
		}
	}

	public final MuteContext mute() throws RecognitionException {
		MuteContext _localctx = new MuteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(2);
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
		enterRule(_localctx, 8, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch (_input.LA(1)) {
			case 4:
				{
				setState(41); playNoteCmd();
				}
				break;
			case 7:
				{
				setState(42); goCmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(45); match(CMDEND);
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
		public List<TerminalNode> INT() { return getTokens(JWagnerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JWagnerParser.INT, i);
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
		enterRule(_localctx, 10, RULE_playNoteCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(4);
			setState(48); match(INT);
			setState(49); match(INT);
			setState(50); match(INT);
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
		public TerminalNode INT() { return getToken(JWagnerParser.INT, 0); }
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
		enterRule(_localctx, 12, RULE_goCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(7);
			setState(54);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(53); match(INT);
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

	public static final String _serializedATN =
		"\2\3\21;\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\5\4 \n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4(\n\4\3\5\3\5\3\6\3\6\5\6.\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b9\n\b\3\b\2\t\2\4\6\b\n\f\16\2\29\2\20\3"+
		"\2\2\2\4\24\3\2\2\2\6\'\3\2\2\2\b)\3\2\2\2\n-\3\2\2\2\f\61\3\2\2\2\16"+
		"\66\3\2\2\2\20\21\7\7\2\2\21\22\7\n\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24"+
		"\31\7\3\2\2\25\30\5\n\6\2\26\30\5\6\4\2\27\25\3\2\2\2\27\26\3\2\2\2\30"+
		"\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34"+
		"\35\7\b\2\2\35\5\3\2\2\2\36 \5\b\5\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2"+
		"\2!\"\7\5\2\2\"#\7\n\2\2#(\5\4\3\2$%\7\5\2\2%&\7\n\2\2&(\7\16\2\2\'\37"+
		"\3\2\2\2\'$\3\2\2\2(\7\3\2\2\2)*\7\4\2\2*\t\3\2\2\2+.\5\f\7\2,.\5\16\b"+
		"\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\7\16\2\2\60\13\3\2\2\2\61\62\7\6"+
		"\2\2\62\63\7\13\2\2\63\64\7\13\2\2\64\65\7\13\2\2\65\r\3\2\2\2\668\7\t"+
		"\2\2\679\7\13\2\28\67\3\2\2\289\3\2\2\29\17\3\2\2\2\b\27\31\37\'-8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}