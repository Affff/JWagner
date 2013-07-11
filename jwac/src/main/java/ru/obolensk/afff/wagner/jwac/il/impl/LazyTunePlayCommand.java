package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public 	class LazyTunePlayCommand extends Command {
	public LazyTunePlayCommand(String tuneName) {
		super("tuneLazyPlay_internal",
				new CommandParam[] { new CommandParam(tuneName) });
	}
	
	public String TuneToPlayName() {
		return getChilds()[0].getValue();
	}
}
