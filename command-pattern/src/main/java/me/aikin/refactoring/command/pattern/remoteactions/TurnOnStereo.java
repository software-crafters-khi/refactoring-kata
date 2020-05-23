package me.aikin.refactoring.command.pattern.remoteactions;

import me.aikin.refactoring.command.pattern.SlotCommand;
import me.aikin.refactoring.command.pattern.Stereo;

public class TurnOnStereo implements SlotCommand {

    private final Stereo stereo;

    public TurnOnStereo(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.on();
        stereo.setCdStatus(true);
        stereo.setVolume(11);
    }
}
