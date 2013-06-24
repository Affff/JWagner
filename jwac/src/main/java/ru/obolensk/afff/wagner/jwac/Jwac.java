package ru.obolensk.afff.wagner.jwac;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import ru.obolensk.afff.wagner.jwac.grammar.JWagnerLexer;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.MelodyDeclarationContext;
import ru.obolensk.afff.wagner.jwac.util.AppCfg;

public class Jwac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(AppCfg.getFullProgramVersion());
		
		try {
			parseFile(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void parseFile(String fileName) throws IOException {
		ANTLRFileStream in = new ANTLRFileStream(fileName);
        Lexer lexer = new JWagnerLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JWagnerParser parser = new JWagnerParser(tokens);
        MelodyDeclarationContext melodyContext = parser.melodyDeclaration();
        //TODO
	}

}
