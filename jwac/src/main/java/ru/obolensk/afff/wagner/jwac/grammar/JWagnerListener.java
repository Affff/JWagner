// Generated from JWagner.g4 by ANTLR 4.0

    package ru.obolensk.afff.wagner.jwac.grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JWagnerListener extends ParseTreeListener {
	void enterTempoValue(JWagnerParser.TempoValueContext ctx);
	void exitTempoValue(JWagnerParser.TempoValueContext ctx);

	void enterNoautofwd(JWagnerParser.NoautofwdContext ctx);
	void exitNoautofwd(JWagnerParser.NoautofwdContext ctx);

	void enterPlay(JWagnerParser.PlayContext ctx);
	void exitPlay(JWagnerParser.PlayContext ctx);

	void enterTactLenghtPrefix(JWagnerParser.TactLenghtPrefixContext ctx);
	void exitTactLenghtPrefix(JWagnerParser.TactLenghtPrefixContext ctx);

	void enterMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx);
	void exitMelodyDeclaration(JWagnerParser.MelodyDeclarationContext ctx);

	void enterEmptyCmd(JWagnerParser.EmptyCmdContext ctx);
	void exitEmptyCmd(JWagnerParser.EmptyCmdContext ctx);

	void enterTune(JWagnerParser.TuneContext ctx);
	void exitTune(JWagnerParser.TuneContext ctx);

	void enterPlayNoteCmd(JWagnerParser.PlayNoteCmdContext ctx);
	void exitPlayNoteCmd(JWagnerParser.PlayNoteCmdContext ctx);

	void enterAsync(JWagnerParser.AsyncContext ctx);
	void exitAsync(JWagnerParser.AsyncContext ctx);

	void enterTactLenghtDot(JWagnerParser.TactLenghtDotContext ctx);
	void exitTactLenghtDot(JWagnerParser.TactLenghtDotContext ctx);

	void enterPlayNow(JWagnerParser.PlayNowContext ctx);
	void exitPlayNow(JWagnerParser.PlayNowContext ctx);

	void enterGoCmd(JWagnerParser.GoCmdContext ctx);
	void exitGoCmd(JWagnerParser.GoCmdContext ctx);

	void enterTactLenghtValue(JWagnerParser.TactLenghtValueContext ctx);
	void exitTactLenghtValue(JWagnerParser.TactLenghtValueContext ctx);

	void enterCommand(JWagnerParser.CommandContext ctx);
	void exitCommand(JWagnerParser.CommandContext ctx);

	void enterTempoDigitValue(JWagnerParser.TempoDigitValueContext ctx);
	void exitTempoDigitValue(JWagnerParser.TempoDigitValueContext ctx);

	void enterMelodyBody(JWagnerParser.MelodyBodyContext ctx);
	void exitMelodyBody(JWagnerParser.MelodyBodyContext ctx);

	void enterTactLenght(JWagnerParser.TactLenghtContext ctx);
	void exitTactLenght(JWagnerParser.TactLenghtContext ctx);

	void enterChannel(JWagnerParser.ChannelContext ctx);
	void exitChannel(JWagnerParser.ChannelContext ctx);

	void enterTempoCmd(JWagnerParser.TempoCmdContext ctx);
	void exitTempoCmd(JWagnerParser.TempoCmdContext ctx);

	void enterNote(JWagnerParser.NoteContext ctx);
	void exitNote(JWagnerParser.NoteContext ctx);
}