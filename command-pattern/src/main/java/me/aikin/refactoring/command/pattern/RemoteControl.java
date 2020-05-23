package me.aikin.refactoring.command.pattern;

public class RemoteControl {
    private final TurnOnLight turnOnLight;
    private final TurnOnCeilingFan turnOnCeilingFan;
    private final TurnOnStereo turnOnStereo;
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
            light.off();
        if (slot == 2)
            ceiling.off();
        if (slot == 3)
            stereo.off();
    }
}
