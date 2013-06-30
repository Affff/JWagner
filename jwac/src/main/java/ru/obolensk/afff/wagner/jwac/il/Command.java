package ru.obolensk.afff.wagner.jwac.il;

public abstract class Command extends CombinedElement<CommandParam> {

	public Command(String name, CommandParam[] params) {
		super(name, params);
	}
	
	public CommandParam[] getParams() {
		return getChilds();
	}

}
