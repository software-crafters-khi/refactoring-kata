package me.aikin.refactoring.command.pattern;

import java.util.HashMap;
import java.util.Map;
import me.aikin.refactoring.command.pattern.remoteactions.*;

public class RemoteControl {
    private final TurnOffLight turnOffLight;
    private final TurnOffCeilingFan turnOffCeilingFan;
    private final TurnOffStereo turnOffStereo;

    private final Map<Integer, SlotCommand> onCommandMap;

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo) {

        this.turnOffLight = new TurnOffLight(light);
        this.turnOffCeilingFan = new TurnOffCeilingFan(ceiling);
        this.turnOffStereo = new TurnOffStereo(stereo);

        this.onCommandMap= new HashMap<>();
        this.onCommandMap.put(1,new TurnOnLight(light));
        this.onCommandMap.put(2,new TurnOnCeilingFan(ceiling));
        this.onCommandMap.put(3,new TurnOnStereo(stereo));
    }


    public void on(int slot) {
        this.onCommandMap.get(slot).execute();
    }

    public void off(int slot) {
        if (slot == 1)
            turnOffLight.execute();
        if (slot == 2)
            turnOffCeilingFan.execute();
        if (slot == 3)
            turnOffStereo.execute();
    }
}
