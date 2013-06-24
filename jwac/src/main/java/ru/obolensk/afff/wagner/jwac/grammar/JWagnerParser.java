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
		WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'play'", "'melody'", "'}'", "';'", "ID", "INT", "LETTER", 
		"DIGIT", "WS"
	};
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_command = 2, RULE_playNote = 3;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "command", "playNote"
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
			setState(8); match(3);
			setState(9); match(ID);
			setState(11);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(10); melodyBody();
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
			setState(13); match(1);
			setState(14); command();
			setState(15); match(4);
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
		public PlayNoteContext playNote(int i) {
			return getRuleContext(PlayNoteContext.class,i);
		}
		public List<PlayNoteContext> playNote() {
			return getRuleContexts(PlayNoteContext.class);
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
		enterRule(_localctx, 4, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2 || _la==5) {
				{
				{
				setState(18);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(17); playNote();
					}
				}

				setState(20); match(5);
				}
				}
				setState(25);
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

	public static class PlayNoteContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(JWagnerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JWagnerParser.INT, i);
		}
		public PlayNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playNote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).enterPlayNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JWagnerListener ) ((JWagnerListener)listener).exitPlayNote(this);
		}
	}

	public final PlayNoteContext playNote() throws RecognitionException {
		PlayNoteContext _localctx = new PlayNoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_playNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(2);
			setState(27); match(INT);
			setState(28); match(INT);
			setState(29); match(INT);
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
		"\2\3\f\"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\5\2\16\n\2\3\3\3"+
		"\3\3\3\3\3\3\4\5\4\25\n\4\3\4\7\4\30\n\4\f\4\16\4\33\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\2\6\2\4\6\b\2\2 \2\n\3\2\2\2\4\17\3\2\2\2\6\31\3\2\2\2\b"+
		"\34\3\2\2\2\n\13\7\5\2\2\13\r\7\b\2\2\f\16\5\4\3\2\r\f\3\2\2\2\r\16\3"+
		"\2\2\2\16\3\3\2\2\2\17\20\7\3\2\2\20\21\5\6\4\2\21\22\7\6\2\2\22\5\3\2"+
		"\2\2\23\25\5\b\5\2\24\23\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\30\7\7"+
		"\2\2\27\24\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\7\3\2"+
		"\2\2\33\31\3\2\2\2\34\35\7\4\2\2\35\36\7\t\2\2\36\37\7\t\2\2\37 \7\t\2"+
		"\2 \t\3\2\2\2\5\r\24\31";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}