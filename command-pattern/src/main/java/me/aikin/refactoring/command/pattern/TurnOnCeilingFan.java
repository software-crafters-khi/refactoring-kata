package me.aikin.refactoring.command.pattern;

public class TurnOnCeilingFan implements SlotCommand{
    public TurnOnCeilingFan(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    private final Ceiling ceiling;

    @Override
    public void execute() {
        ceiling.high();
    }
}
