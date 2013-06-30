package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public class GoCommand extends Command {

	public GoCommand() {
		super("go", new CommandParam[] { new CommandParam("1") });
	}

	public GoCommand(CommandParam forwardTactsCount) {
		super("go", new CommandParam[] { forwardTactsCount });
	}

	public int getForwardTactsCount() {
		return getChilds()[0].getIntValue();
	}

	@Override
	public String toString() {
		return getName() + " for " + getForwardTactsCount() + " tacts forward";
	}
}
