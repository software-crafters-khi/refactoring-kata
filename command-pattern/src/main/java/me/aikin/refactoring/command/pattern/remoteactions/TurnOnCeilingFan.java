package me.aikin.refactoring.command.pattern.remoteactions;

import me.aikin.refactoring.command.pattern.Ceiling;
import me.aikin.refactoring.command.pattern.SlotCommand;

public class TurnOnCeilingFan implements SlotCommand {
    public TurnOnCeilingFan(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    private final Ceiling ceiling;

    @Override
    public void execute() {
        ceiling.high();
    }
}
