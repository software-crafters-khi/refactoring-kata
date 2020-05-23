package me.aikin.refactoring.command.pattern;

import java.util.Arrays;
import java.util.List;
import me.aikin.refactoring.command.pattern.slots.Slot;

public class RemoteControl {

    private final List<Slot> remoteSlots;

    public RemoteControl(Slot... slots) {
        remoteSlots = Arrays.asList(slots);
    }

    public void on(RemoteSlot slot) {
        remoteSlots.get(slot.value).on();
    }

    public void off(RemoteSlot slot) {
        remoteSlots.get(slot.value).off();
    }

}
