package ru.obolensk.afff.wagner.jwac;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.obolensk.afff.wagner.jwac.compiler.JavaClassCompiler;
import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.ILBuilder;
import ru.obolensk.afff.wagner.jwac.il.Melody;
import ru.obolensk.afff.wagner.jwac.il.impl.GoCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PlayNoteCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PopTactCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PushTactCommand;
import ru.obolensk.afff.wagner.jwac.util.AppCfg;
import ru.obolensk.afff.wagner.jwac.verify.LangVerifier;
import ru.obolensk.afff.wagner.runtime.JWagnerRuntime;

public class Jwac {

	private static final Logger logger = LoggerFactory.getLogger(Jwac.class);

	public static void main(String[] args) {
		System.out.println(AppCfg.getFullProgramVersion());

		Melody melody = null;

		try {
			melody = new ILBuilder().parseFile(args[0]);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}

		System.out.println("Melody '" + melody.getName() + "' from '"
				+ new File(args[0]).getName() + "' loaded.");
		logger.trace("\n" + melody.toString());

		new LangVerifier().verify(melody);

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

		new JavaClassCompiler().compile(melody);

		System.out.println("Melody compiled sucsessfully.");
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
				} else if (command instanceof PushTactCommand) {
					runtime.pushTact();
				} else if (command instanceof PopTactCommand) {
					runtime.popTact();
				} 
			}
			runtime.play();
		}
	}

}
