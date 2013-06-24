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
		T__1=1, T__0=2, ID=3, INT=4, WS=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'play'", "'melody'", "ID", "INT", "WS"
	};
	public static final int
		RULE_melodyDeclaration = 0, RULE_melodyBody = 1, RULE_playNote = 2;
	public static final String[] ruleNames = {
		"melodyDeclaration", "melodyBody", "playNote"
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
			setState(6); match(2);
			setState(7); match(ID);
			setState(9);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(8); melodyBody();
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
		public PlayNoteContext playNote() {
			return getRuleContext(PlayNoteContext.class,0);
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
			setState(11); playNote();
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
		enterRule(_localctx, 4, RULE_playNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); match(1);
			setState(14); match(INT);
			setState(15); match(INT);
			setState(16); match(INT);
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
		"\2\3\7\25\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\5\2\f\n\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\2\5\2\4\6\2\2\22\2\b\3\2\2\2\4\r\3\2\2\2\6\17\3\2\2"+
		"\2\b\t\7\4\2\2\t\13\7\5\2\2\n\f\5\4\3\2\13\n\3\2\2\2\13\f\3\2\2\2\f\3"+
		"\3\2\2\2\r\16\5\6\4\2\16\5\3\2\2\2\17\20\7\3\2\2\20\21\7\6\2\2\21\22\7"+
		"\6\2\2\22\23\7\6\2\2\23\7\3\2\2\2\3\13";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}