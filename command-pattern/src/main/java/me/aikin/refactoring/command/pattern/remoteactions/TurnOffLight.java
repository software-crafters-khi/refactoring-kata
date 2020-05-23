package me.aikin.refactoring.command.pattern.remoteactions;

import me.aikin.refactoring.command.pattern.Light;
import me.aikin.refactoring.command.pattern.SlotCommand;

public class TurnOffLight implements SlotCommand {
    private final Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
