// Generated from JWagner.g4 by ANTLR 4.0

    package ru.obolensk.afff.wagner.jwac.grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JWagnerListener extends ParseTreeListener {
	void enterMelodyBody(JWagnerParser.MelodyBodyContext ctx);
	void exitMelodyBody(JWagnerParser.MelodyBodyContext ctx);

	void enterMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx);
	void exitMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx);

	void enterPlayNote(JWagnerParser.PlayNoteContext ctx);
	void exitPlayNote(JWagnerParser.PlayNoteContext ctx);
}