package ru.obolensk.afff.wagner.jwac;

import org.antlr.v4.runtime.misc.TestRig;

public class GrammarTree {

	public static void main(String[] args) throws Exception {
		TestRig.main(new String[] {
				"ru.obolensk.afff.wagner.jwac.grammar.JWagner",
				"melodyDeclaration",
				"src/main/java/ru/obolensk/afff/wagner/jwac/grammar/JWagner.g4",
				"-gui", "-tree" });
	}

}
