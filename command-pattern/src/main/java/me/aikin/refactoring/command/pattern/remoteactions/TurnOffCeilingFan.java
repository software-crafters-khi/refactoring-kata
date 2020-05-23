package me.aikin.refactoring.command.pattern.remoteactions;

import me.aikin.refactoring.command.pattern.Ceiling;
import me.aikin.refactoring.command.pattern.SlotCommand;

public class TurnOffCeilingFan implements SlotCommand {

    public TurnOffCeilingFan(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    private final Ceiling ceiling;

    @Override
    public void execute() {
        ceiling.off();
    }
}
