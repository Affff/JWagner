package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public class GoCommand extends AbstractForwardingCommand {

	public GoCommand() {
		super("go", new CommandParam[] { new CommandParam("1") });
	}

	public GoCommand(CommandParam forwardTactsCount) {
		super("go", new CommandParam[] { forwardTactsCount });
	}

	@Override
	protected int getNoteLengthParamIndex() {
		return 0;
	}

	@Override
	public String toString() {
		return getName() + " for " + getLenghtInTacts() + " tacts forward";
	}

}
