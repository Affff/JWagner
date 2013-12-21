package ru.obolensk.afff.wagner.jwac.il.impl;

import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public class PlayNoteCommand extends AbstractForwardingCommand {

	public PlayNoteCommand(CommandParam note, CommandParam tacts,
			CommandParam channel) {
		super("playNote", new CommandParam[] { note, tacts, channel });
	}

	public String getNote() {
		return getChilds()[0].getValue();
	}

	public int getChannel() {
		return getChilds()[2].getIntValue();
	}

	@Override
	protected int getNoteLengthParamIndex() {
		return 1;
	}

	@Override
	public String toString() {
		return getName() + "(note=" + getNote() + ",tacts=" + getLenghtInTacts()
				+ ",channel=" + getChannel() + ");";
	}
}
