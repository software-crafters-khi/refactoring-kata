package me.aikin.refactoring.command.pattern;

import java.util.HashMap;
import java.util.Map;
import me.aikin.refactoring.command.pattern.remoteactions.*;

public class RemoteControl {

    private final Map<Integer, SlotCommand> onCommandMap;
    private final Map<Integer, SlotCommand> offCommandMap;

    public RemoteControl(Light light, Ceiling ceiling, Stereo stereo) {

        this.onCommandMap= new HashMap<>();
        this.onCommandMap.put(1,new TurnOnLight(light));
        this.onCommandMap.put(2,new TurnOnCeilingFan(ceiling));
        this.onCommandMap.put(3,new TurnOnStereo(stereo));

        this.offCommandMap = new HashMap<>();
        this.offCommandMap.put(1,new TurnOffLight(light));
        this.offCommandMap.put(2,new TurnOffCeilingFan(ceiling));
        this.offCommandMap.put(3,new TurnOffStereo(stereo));
    }

    public void on(int slot) {
        this.onCommandMap.get(slot).execute();
    }

    public void off(int slot) {
        this.offCommandMap.get(slot).execute();
    }
}
