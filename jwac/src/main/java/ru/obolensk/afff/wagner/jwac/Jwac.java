package ru.obolensk.afff.wagner.jwac;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.obolensk.afff.wagner.jwac.grammar.JWagnerLexer;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.CommandsContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.GoCmdContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.MelodyBodyContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.MelodyDeclarationContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.PlayNoteCmdContext;
import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;
import ru.obolensk.afff.wagner.jwac.il.CommandsBlock;
import ru.obolensk.afff.wagner.jwac.il.Melody;
import ru.obolensk.afff.wagner.jwac.il.impl.GoCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PlayNoteCommand;
import ru.obolensk.afff.wagner.jwac.util.AppCfg;
import ru.obolensk.afff.wagner.runtime.JWagnerRuntime;

public class Jwac {

	private static final Logger logger = LoggerFactory.getLogger(Jwac.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(AppCfg.getFullProgramVersion());

		Melody melody = null;

		try {
			melody = parseFile(args[0]);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}

		System.out.println("Melody '" + melody.getName() + "' from '"
				+ new File(args[0]).getName() + "' loaded.");
		logger.trace("\n" + melody.toString());

		verify(melody);

		System.out.println("Melody verified.");

		if (args.length > 1 && args[1] == "i") {
			System.out.print("Test playing turned on. Playing the melody...");
			try {
				play(melody);
				System.out.println(" done.");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		compile(melody);

		System.out.println("Melody compiled sucsessfully.");
	}

	private static Melody parseFile(String fileName) throws IOException {
		ANTLRFileStream in = new ANTLRFileStream(fileName);
		Lexer lexer = new JWagnerLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JWagnerParser parser = new JWagnerParser(tokens);
		MelodyDeclarationContext melodyContext = parser.melodyDeclaration();
		MelodyBodyContext body = melodyContext.melodyBody();
		CommandsContext commands = body.commands();
		List<Command> commandsList = new ArrayList<Command>();
		for (ParseTree child : commands.children) {
			Object cmd = child.getPayload();
			if (cmd instanceof PlayNoteCmdContext) {
				PlayNoteCmdContext playNote = (PlayNoteCmdContext) cmd;
				CommandParam note = new CommandParam(playNote.getChild(1)
						.getText());
				CommandParam tacts = new CommandParam(playNote.getChild(2)
						.getText());
				CommandParam channel = new CommandParam(playNote.getChild(3)
						.getText());
				commandsList.add(new PlayNoteCommand(note, tacts, channel));
			} else if (cmd instanceof GoCmdContext) {
				GoCmdContext goForward = (GoCmdContext) cmd;
				if (goForward.getChildCount() > 1) {
					CommandParam tactsForward = new CommandParam(goForward
							.getChild(1).getText());
					commandsList.add(new GoCommand(tactsForward));
				} else {
					commandsList.add(new GoCommand());
				}
			}
		}

		CommandsBlock block = new CommandsBlock(
				commandsList.toArray(new Command[0]));

		return new Melody(melodyContext.ID().getText(), block);
	}

	private static void verify(Melody melody) {
		// TODO do melody postverification
	}

	private static void play(Melody melody) throws Exception {
		try (JWagnerRuntime runtime = new JWagnerRuntime()) {
			for (Command command : melody.getCommandsBlock().getCommands()) {
				if (command instanceof PlayNoteCommand) {
					PlayNoteCommand playCmd = (PlayNoteCommand) command;
					runtime.playNote(playCmd.getNote(), playCmd.getTacts(),
							playCmd.getChannel());
				} else if (command instanceof GoCommand) {
					GoCommand goCmd = (GoCommand) command;
					runtime.goForward(goCmd.getForwardTactsCount());
				}
			}
			runtime.play();
		}
	}

	private static void compile(Melody melody) {
		// TODO compile melody to class
	}

}
