// Generated from JWagner.g4 by ANTLR 4.0

    package ru.obolensk.afff.wagner.jwac.grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JWagnerListener extends ParseTreeListener {
	void enterGoCmd(JWagnerParser.GoCmdContext ctx);
	void exitGoCmd(JWagnerParser.GoCmdContext ctx);

	void enterNopCmd(JWagnerParser.NopCmdContext ctx);
	void exitNopCmd(JWagnerParser.NopCmdContext ctx);

	void enterCommands(JWagnerParser.CommandsContext ctx);
	void exitCommands(JWagnerParser.CommandsContext ctx);

	void enterMelodyBody(JWagnerParser.MelodyBodyContext ctx);
	void exitMelodyBody(JWagnerParser.MelodyBodyContext ctx);

	void enterMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx);
	void exitMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx);

	void enterPlayNoteCmd(JWagnerParser.PlayNoteCmdContext ctx);
	void exitPlayNoteCmd(JWagnerParser.PlayNoteCmdContext ctx);
}