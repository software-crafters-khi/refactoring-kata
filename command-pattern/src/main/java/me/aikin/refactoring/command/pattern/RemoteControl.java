package me.aikin.refactoring.command.pattern;

public class RemoteControl {
    private final TurnOnLight turnOnLight;
    private final Light light;
    private final Ceiling ceiling;
    private final Stereo stereo;

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo) {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
        this.turnOnLight = new TurnOnLight(light);
    }



    public void on(int slot) {
        if (slot == 1)
            turnOnLight.execute();
        if (slot == 2)
            ceiling.high();
        if (slot == 3) {
            stereo.on();
            stereo.setCdStatus(true);
            stereo.setVolume(11);
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
