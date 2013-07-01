// Generated from JWagner.g4 by ANTLR 4.0

    package ru.obolensk.afff.wagner.jwac.grammar;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class JWagnerBaseListener implements JWagnerListener {
	@Override public void enterGoCmd(JWagnerParser.GoCmdContext ctx) { }
	@Override public void exitGoCmd(JWagnerParser.GoCmdContext ctx) { }

	@Override public void enterCommand(JWagnerParser.CommandContext ctx) { }
	@Override public void exitCommand(JWagnerParser.CommandContext ctx) { }

	@Override public void enterMelodyBody(JWagnerParser.MelodyBodyContext ctx) { }
	@Override public void exitMelodyBody(JWagnerParser.MelodyBodyContext ctx) { }

	@Override public void enterMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx) { }
	@Override public void exitMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx) { }

	@Override public void enterTune(JWagnerParser.TuneContext ctx) { }
	@Override public void exitTune(JWagnerParser.TuneContext ctx) { }

	@Override public void enterPlayNoteCmd(JWagnerParser.PlayNoteCmdContext ctx) { }
	@Override public void exitPlayNoteCmd(JWagnerParser.PlayNoteCmdContext ctx) { }

	@Override public void enterMute(JWagnerParser.MuteContext ctx) { }
	@Override public void exitMute(JWagnerParser.MuteContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}