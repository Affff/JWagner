package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public class TempoCommand extends Command {

	public TempoCommand(String tempo) {
		super("tempo", new CommandParam[] { new CommandParam(tempo) });
	}

	public String getTempo() {
		return getChilds()[0].getValue();
	}

	@Override
	public String toString() {
		return "tempo = " + getTempo();
	}
}
