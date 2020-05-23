package me.aikin.refactoring.command.pattern;

import java.util.Arrays;
import java.util.List;
import me.aikin.refactoring.command.pattern.exception.InvalidSlotException;
import me.aikin.refactoring.command.pattern.slots.Slot;

public class RemoteControl {

    private List<Slot> remoteSlots;

    public RemoteControl(Slot... slots) {
        remoteSlots = Arrays.asList(slots);
    }

    public void on(int slot) throws InvalidSlotException {
        validateSlot(slot);
        remoteSlots.get(slot).on();
    }

    public void off(int slot) throws InvalidSlotException {
        validateSlot(slot);
        remoteSlots.get(slot).off();

    }

    private void validateSlot(int slot) throws InvalidSlotException {
        if (slot < 0 || slot >= remoteSlots.size()) {
            throw new InvalidSlotException();
        }
    }

}
