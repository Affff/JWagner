package ru.obolensk.afff.wagner.jwac.il;

public class CommandsBlock extends CombinedElement<Command> {

	public CommandsBlock(Command... commands) {
		super("commandsBlock", commands);
	}
	
	public Command[] getCommands() {
		return getChilds();
	}
	
}
