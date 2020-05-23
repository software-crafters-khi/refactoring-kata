package me.aikin.refactoring.command.pattern.remoteactions;

import me.aikin.refactoring.command.pattern.SlotCommand;
import me.aikin.refactoring.command.pattern.Stereo;

public class TurnOffStereo implements SlotCommand {


    private final Stereo stereo;

    public TurnOffStereo(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
