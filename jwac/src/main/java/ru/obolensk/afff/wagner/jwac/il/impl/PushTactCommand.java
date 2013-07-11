package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public class PushTactCommand extends Command {
	public PushTactCommand() {
		super("pushTact_internal", new CommandParam[] {});
	}
}
