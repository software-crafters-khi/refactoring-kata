package me.aikin.refactoring.command.pattern.slots;

import me.aikin.refactoring.command.pattern.Stereo;
import me.aikin.refactoring.command.pattern.remoteactions.TurnOffStereo;
import me.aikin.refactoring.command.pattern.remoteactions.TurnOnStereo;

public class StereoSlot implements Slot {

    TurnOnStereo turnOnStereo;
    TurnOffStereo turnOffStereo;

    public StereoSlot(Stereo stereo) {
        this.turnOnStereo = new TurnOnStereo(stereo);
        this.turnOffStereo = new TurnOffStereo(stereo);
    }

    @Override
    public void on() {
        turnOnStereo.execute();
    }

    @Override
    public void off() {
        turnOffStereo.execute();
    }
}
