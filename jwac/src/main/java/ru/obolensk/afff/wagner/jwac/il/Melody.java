package ru.obolensk.afff.wagner.jwac.il;

import ru.obolensk.afff.wagner.jwac.il.impl.TactsForwarding;
import ru.obolensk.afff.wagner.runtime.TempoDecoder;

public class Melody extends CombinedElement<CommandsBlock> {
	
	private final int minNotePart;

	public Melody(String name, CommandsBlock block) {
		super(name, block);
		minNotePart = optimizeMelody();
	}
	
	private int optimizeMelody() {
		// find minimal note part, used in melody
		int minNotePart = TempoDecoder.MINIMAL_NOTE_PART;
		for (Command command : getCommandsBlock().getCommands()) {
			if (command instanceof TactsForwarding) {
				TactsForwarding fwd = (TactsForwarding) command;
				if (fwd.getLenghtInTacts() < minNotePart) {
					minNotePart = fwd.getLenghtInTacts();
				}
			}
		}
		
		// normalize current commands tact lengths by minimal note part
		for (Command command : getCommandsBlock().getCommands()) {
			if (command instanceof TactsForwarding) {
				TactsForwarding fwd = (TactsForwarding) command;
				fwd.reduceLenghtInTacts(minNotePart);
			}
		}
		
		return minNotePart;
	}

	public final CommandsBlock getCommandsBlock() {
		return (CommandsBlock) getChilds()[0];
	}

	public int getMinNotePart() {
		return minNotePart;
	}
}
