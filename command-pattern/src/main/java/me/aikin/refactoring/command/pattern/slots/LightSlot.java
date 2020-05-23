package me.aikin.refactoring.command.pattern.slots;

import me.aikin.refactoring.command.pattern.Light;
import me.aikin.refactoring.command.pattern.remoteactions.TurnOffLight;
import me.aikin.refactoring.command.pattern.remoteactions.TurnOnLight;

public class LightSlot implements Slot {

    TurnOnLight turnOnLight;
    TurnOffLight turnOffLight;

    public LightSlot(Light light) {
        this.turnOnLight = new TurnOnLight(light);
        this.turnOffLight = new TurnOffLight(light);
    }

    @Override
    public void on() {
        turnOnLight.execute();
    }

    @Override
    public void off() {
        turnOffLight.execute();
    }
}
