package me.aikin.refactoring.command.pattern;

import me.aikin.refactoring.command.pattern.remoteactions.*;

public class RemoteControl {
    private final TurnOnLight turnOnLight;
    private final TurnOnCeilingFan turnOnCeilingFan;
    private final TurnOnStereo turnOnStereo;
    private final TurnOffLight turnOffLight;
    private final TurnOffCeilingFan turnOffCeilingFan;
    private final TurnOffStereo turnOffStereo;
    private final Light light;
    private final Ceiling ceiling;
    private final Stereo stereo;

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo) {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
        this.turnOnLight = new TurnOnLight(light);
        this.turnOnCeilingFan = new TurnOnCeilingFan(ceiling);
        this.turnOnStereo = new TurnOnStereo(stereo);
        this.turnOffLight = new TurnOffLight(light);
        this.turnOffCeilingFan = new TurnOffCeilingFan(ceiling);
        this.turnOffStereo = new TurnOffStereo(stereo);
    }



    public void on(int slot) {
        if (slot == 1)
            turnOnLight.execute();
        if (slot == 2)
            turnOnCeilingFan.execute();
        if (slot == 3) {
            turnOnStereo.execute();
        }
    }

    public void off(int slot) {
        if (slot == 1)
            turnOffLight.execute();
        if (slot == 2)
            turnOffCeilingFan.execute();
        if (slot == 3)
            turnOffStereo.execute();
    }
}
