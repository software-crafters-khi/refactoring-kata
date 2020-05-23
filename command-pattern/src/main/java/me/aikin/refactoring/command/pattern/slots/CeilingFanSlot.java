package me.aikin.refactoring.command.pattern.slots;

import me.aikin.refactoring.command.pattern.Ceiling;
import me.aikin.refactoring.command.pattern.remoteactions.TurnOffCeilingFan;
import me.aikin.refactoring.command.pattern.remoteactions.TurnOnCeilingFan;

public class CeilingFanSlot implements Slot {

    TurnOnCeilingFan turnOnCeilingFan;
    TurnOffCeilingFan turnOffCeilingFan;

    public CeilingFanSlot(Ceiling ceiling) {
        this.turnOnCeilingFan = new TurnOnCeilingFan(ceiling);
        this.turnOffCeilingFan = new TurnOffCeilingFan(ceiling);
    }

    @Override
    public void on() {
        turnOnCeilingFan.execute();
    }

    @Override
    public void off() {
        turnOffCeilingFan.execute();
    }
}
