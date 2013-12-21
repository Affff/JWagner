package ru.obolensk.afff.wagner.jwac.il;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.obolensk.afff.wagner.jwac.grammar.JWagnerLexer;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.ChannelContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.CommandContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.EmptyCmdContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.GoCmdContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.MelodyBodyContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.MelodyDeclarationContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.PlayNoteCmdContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.TactLenghtContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.TempoCmdContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.TempoValueContext;
import ru.obolensk.afff.wagner.jwac.grammar.JWagnerParser.TuneContext;
import ru.obolensk.afff.wagner.jwac.il.impl.GoCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.LazyTunePlayCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PlayNoteCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PopTactCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.PushTactCommand;
import ru.obolensk.afff.wagner.jwac.il.impl.TempoCommand;

public class ILBuilder {
	
	private static final Logger logger = LoggerFactory.getLogger(ILBuilder.class);

	public Melody parseFile(String fileName) throws IOException {
		ANTLRFileStream in = new ANTLRFileStream(fileName);
		Lexer lexer = new JWagnerLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		if (logger.isTraceEnabled()) {
			tokens.consume();
			tokens.fill();
			logger.trace("***Start of tokens stream...");
			for (Token token : tokens.getTokens()) {
				logger.trace(token.getText());
			}
			logger.trace("***End of tokens stream.");
			tokens.reset();
		}
		
		final JWagnerParser parser = new JWagnerParser(tokens);
		
		if (logger.isTraceEnabled()) {
			parser.setTrace(true);
			parser.addParseListener(new ParseTreeListener() {
				@Override
				public void visitTerminal(TerminalNode paramTerminalNode) {
				}
				@Override
				public void visitErrorNode(ErrorNode paramErrorNode) {
					logger.trace("expected tokens is " + parser.getExpectedTokensWithinCurrentRule().toString());
					logger.trace("rule invocation stack is " + parser.getRuleInvocationStack().toString());
				}
				@Override
				public void exitEveryRule(ParserRuleContext paramParserRuleContext) {
				}
				@Override
				public void enterEveryRule(ParserRuleContext paramParserRuleContext) {
				}
			});
		}
		
		if (logger.isTraceEnabled()) {
			logger.trace("!!!Parser runned...");
		}
		MelodyDeclarationContext melodyContext = parser.melodyDeclaration();
		if (logger.isTraceEnabled()) {
			logger.trace("!!!Parser done.");
		}
		
		MelodyBodyContext body = melodyContext.melodyBody();

		// processing commands
		List<Command> commandsList = new ArrayList<Command>();
		Map<String, List<Command>> mutesList = new HashMap<String, List<Command>>();
		List<ParseTree> commands = body.children;
		parseBody(commands, commandsList, mutesList);

		CommandsBlock block = new CommandsBlock(
				commandsList.toArray(new Command[0]));
		
		if (logger.isTraceEnabled()) {
			parser.dumpDFA();
		}

		return new Melody(melodyContext.ID().getText(), block);
	}

	private static void parseBody(List<ParseTree> commands,
			List<Command> commandsList, Map<String, List<Command>> mutesList) {
		for (ParseTree currEl : commands) {
			if (currEl instanceof CommandContext) {
				// process single command
				CommandContext commandContext = (CommandContext) currEl;
				Object cmd = commandContext.getChild(0).getPayload();
				if (cmd instanceof PlayNoteCmdContext) {
					PlayNoteCmdContext playNote = (PlayNoteCmdContext) cmd;
					CommandParam note = new CommandParam(playNote.note()
							.getText());
					TactLenghtContext tactLenghtCtx = playNote.tactLenght();
					CommandParam tactLenght = new CommandParam(
							tactLenghtCtx != null ? tactLenghtCtx.getText()
									: "1");
					ChannelContext channelCtx = playNote.channel();
					CommandParam channel = new CommandParam(
							channelCtx != null ? channelCtx.getText() : "1");
					commandsList.add(new PlayNoteCommand(note, tactLenght,
							channel));
					if (playNote.noautofwd() == null) {
						commandsList.add(new GoCommand(tactLenght));
					}
				} else if (cmd instanceof GoCmdContext) {
					GoCmdContext goForward = (GoCmdContext) cmd;
					if (goForward.getChildCount() > 1) {
						CommandParam tactsForward = new CommandParam(goForward
								.getChild(1).getText());
						commandsList.add(new GoCommand(tactsForward));
					} else {
						commandsList.add(new GoCommand());
					}
				} else if (cmd instanceof TempoCmdContext) {
					TempoCmdContext tempo = (TempoCmdContext) cmd;
					TempoValueContext tempoValueCtx = tempo.tempoValue();
					String tempoStr = tempoValueCtx.getText();
					commandsList.add(new TempoCommand(tempoStr));
				} else if (cmd instanceof EmptyCmdContext) {
					//do nothing
				}
			} else if (currEl instanceof TuneContext) {
				// process tune block
				TuneContext tuneContext = (TuneContext) currEl;
				String tuneName = tuneContext.ID().getText();
				List<Command> tuneCmdList = new ArrayList<Command>();
				MelodyBodyContext body = tuneContext.melodyBody();
				boolean isMute = (tuneContext.playNow() == null);
				boolean isAsync = false;
				if (!isMute) {
					isMute = (tuneContext.playNow().play() == null);
					isAsync = (tuneContext.playNow().async() != null);
				}
				if (isAsync) {
					commandsList.add(new PushTactCommand());
				}
				if (body != null) {
					// if tune with body, recursive process it
					List<ParseTree> subCommands = body.children;
					parseBody(subCommands, tuneCmdList, mutesList);
					playPreviousCalls(commandsList, tuneName, tuneCmdList);
					if (!isMute) {
						commandsList.addAll(tuneCmdList);
					}
					mutesList.put(tuneName, tuneCmdList);
				} else {
					// if it is tune play command, play it
					List<Command> cmdList = mutesList.get(tuneName);
					if (cmdList != null) {
						commandsList.addAll(cmdList);
					} else {
						// if tune not declared for now, add tune for playing in
						// future
						commandsList.add(new LazyTunePlayCommand(tuneName));
					}
				}
				if (isAsync) {
					commandsList.add(new PopTactCommand());
				}				
			}
		}
	}

	private static void playPreviousCalls(List<Command> commandsList, String tuneName,
			List<Command> subCommands) {
		for (int i = 0; i < commandsList.size(); i++) {
			Command command = commandsList.get(i);
			if (command instanceof LazyTunePlayCommand) {
				LazyTunePlayCommand lazyTune = (LazyTunePlayCommand) command;
				if (tuneName.equals(lazyTune.TuneToPlayName())) {
					commandsList.remove(i);
					commandsList.addAll(i, subCommands);
					i += subCommands.size() - 1;
				}
			}
		}
	}
}
