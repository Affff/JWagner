package ru.obolensk.afff.wagner.jwac.il.impl;

import static ru.obolensk.afff.wagner.runtime.TempoDecoder.noteLenghtStrTo128PartNoteCount;
import ru.obolensk.afff.wagner.jwac.il.Command;
import ru.obolensk.afff.wagner.jwac.il.CommandParam;

public abstract class AbstractForwardingCommand extends Command implements TactsForwarding {

	private int lenghtInTacts = -1;
	private boolean reduced = false;

	public AbstractForwardingCommand(String name, CommandParam[] params) {
		super(name, params);
	}

	@Override
	public int getLenghtInTacts() {
		if (lenghtInTacts == -1) {
			lenghtInTacts = noteLenghtStrTo128PartNoteCount(getChilds()[getNoteLengthParamIndex()]
					.getValue());
		}
		return lenghtInTacts;
	}
	
	protected abstract int getNoteLengthParamIndex();

	@Override
	public void reduceLenghtInTacts(int reduceBy) {
		if (!reduced) {
			this.lenghtInTacts /= reduceBy;
			reduced = true;
		}
	}
}
