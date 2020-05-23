package me.aikin.refactoring.command.pattern;

public class TurnOnLight implements SlotCommand {

    private final Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
