package me.aikin.refactoring.command.pattern;

import java.util.Arrays;
import java.util.List;
import me.aikin.refactoring.command.pattern.slots.Slot;

public class RemoteControl {

    private List<Slot> remoteSlots;

    public RemoteControl(Slot... slots) {
        remoteSlots = Arrays.asList(slots);
    }

    public void on(int slot) {
        remoteSlots.get(slot).on();
    }

    public void off(int slot) {
        remoteSlots.get(slot).off();

    }
}
