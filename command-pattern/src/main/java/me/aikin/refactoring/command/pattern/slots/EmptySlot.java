package me.aikin.refactoring.command.pattern.slots;

public class EmptySlot implements Slot {

    @Override
    public void on() {
        System.out.println("Does Nothing");
    }

    @Override
    public void off() {
        System.out.println("Does Nothing");
    }
}
