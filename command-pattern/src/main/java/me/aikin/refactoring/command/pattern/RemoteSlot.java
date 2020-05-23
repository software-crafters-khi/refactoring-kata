package me.aikin.refactoring.command.pattern;

public enum RemoteSlot {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

    int value;
    RemoteSlot(int slot){
        this.value = slot;
    }
}
