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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, INT=7, LETTER=8, DIGIT=9, 
		NEWLINE=10, ROWCOMMENT=11, BLOCKCOMMENT=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'play'", "'melody'", "'}'", "'go'", "ID", "INT", 
		"LETTER", "DIGIT", "NEWLINE", "ROWCOMMENT", "BLOCKCOMMENT", "WS"
	};
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_commands = 2, RULE_nopCmd = 3, 
		RULE_playNoteCmd = 4, RULE_goCmd = 5;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "commands", "nopCmd", "playNoteCmd", 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(3);
			setState(13); match(ID);
			setState(15);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(14); melodyBody();
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

	public static class MelodyBodyContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(1);
			setState(18); commands();
			setState(19); match(4);
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

	public static class CommandsContext extends ParserRuleContext {
		public List<GoCmdContext> goCmd() {
			return getRuleContexts(GoCmdContext.class);
		}
		public List<NopCmdContext> nopCmd() {
			return getRuleContexts(NopCmdContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JWagnerParser.NEWLINE); }
		public NopCmdContext nopCmd(int i) {
			return getRuleContext(NopCmdContext.class,i);
		}
		public GoCmdContext goCmd(int i) {
			return getRuleContext(GoCmdContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(JWagnerParser.NEWLINE, i);
		}
		public PlayNoteCmdContext playNoteCmd(int i) {
			return getRuleContext(PlayNoteCmdContext.class,i);
		}
		public List<PlayNoteCmdContext> playNoteCmd() {
			return getRuleContexts(PlayNoteCmdContext.class);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(24);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(21); nopCmd();
					}
					break;
				case 2:
					{
					setState(22); playNoteCmd();
					}
					break;
				case 5:
					{
					setState(23); goCmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(26); match(NEWLINE);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NopCmdContext extends ParserRuleContext {
		public NopCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nopCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterNopCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitNopCmd(this);
		}
	}

	public final NopCmdContext nopCmd() throws RecognitionException {
		NopCmdContext _localctx = new NopCmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nopCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 8, RULE_playNoteCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(2);
			setState(36); match(INT);
			setState(37); match(INT);
			setState(38); match(INT);
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
		enterRule(_localctx, 10, RULE_goCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(5);
			setState(42);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(41); match(INT);
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
		"\2\3\17/\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5"+
		"\2\22\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\7\4\37\n\4\f"+
		"\4\16\4\"\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7-\n\7\3\7\2\b\2"+
		"\4\6\b\n\f\2\2-\2\16\3\2\2\2\4\23\3\2\2\2\6 \3\2\2\2\b#\3\2\2\2\n%\3\2"+
		"\2\2\f*\3\2\2\2\16\17\7\5\2\2\17\21\7\b\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\3\2\2\24\25\5\6\4\2\25\26\7\6\2"+
		"\2\26\5\3\2\2\2\27\33\5\b\5\2\30\33\5\n\6\2\31\33\5\f\7\2\32\27\3\2\2"+
		"\2\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\35\7\f\2\2\35\37\3\2\2"+
		"\2\36\32\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2"+
		"\2\2#$\3\2\2\2$\t\3\2\2\2%&\7\4\2\2&\'\7\t\2\2\'(\7\t\2\2()\7\t\2\2)\13"+
		"\3\2\2\2*,\7\7\2\2+-\7\t\2\2,+\3\2\2\2,-\3\2\2\2-\r\3\2\2\2\6\21\32 ,";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}