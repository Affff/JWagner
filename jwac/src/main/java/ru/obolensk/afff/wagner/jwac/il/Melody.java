package ru.obolensk.afff.wagner.jwac.il;

public class Melody extends CombinedElement<CommandsBlock> {

	public Melody(String name, CommandsBlock block) {
		super(name, block);
	}
	
	public final CommandsBlock getCommandsBlock() {
		return (CommandsBlock) getChilds()[0];
	}
}
