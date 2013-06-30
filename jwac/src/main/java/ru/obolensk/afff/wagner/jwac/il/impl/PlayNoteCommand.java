package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public class PlayNoteCommand extends Command {

	public PlayNoteCommand(CommandParam note, CommandParam tacts,
			CommandParam channel) {
		super("playNote", new CommandParam[] { note, tacts, channel });
	}

	public int getNote() {
		return getChilds()[0].getIntValue();
	}

	public int getTacts() {
		return getChilds()[1].getIntValue();
	}

	public int getChannel() {
		return getChilds()[2].getIntValue();
	}

	@Override
	public String toString() {
		return getName() + "(note=" + getNote() + ",tacts=" + getTacts()
				+ ",channel=" + getChannel() + ");";
	}
}
