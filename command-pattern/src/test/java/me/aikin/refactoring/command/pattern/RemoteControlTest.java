package me.aikin.refactoring.command.pattern;

import me.aikin.refactoring.command.pattern.exception.InvalidSlotException;
import me.aikin.refactoring.command.pattern.slots.CeilingFanSlot;
import me.aikin.refactoring.command.pattern.slots.EmptySlot;
import me.aikin.refactoring.command.pattern.slots.LightSlot;
import me.aikin.refactoring.command.pattern.slots.StereoSlot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoteControlTest {

    EmptySlot emptySlot = new EmptySlot();

    @Test
    public void should_turn_on_light_when_press_first_on_button() throws InvalidSlotException {
        Light light = new Light();
        LightSlot lightSlot = new LightSlot(light);

        RemoteControl remoteControl = new RemoteControl(emptySlot, lightSlot);
        remoteControl.on(RemoteSlot.ONE);

        assertTrue(light.status());
    }


    @Test
    public void should_turn_off_light_when_press_first_off_button() throws InvalidSlotException {
        Light light = new Light();
        LightSlot lightSlot = new LightSlot(light);
        RemoteControl remoteControl = new RemoteControl(emptySlot,lightSlot);
        remoteControl.off(RemoteSlot.ONE);
        assertFalse(light.status());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button() throws InvalidSlotException {
        Ceiling ceiling = new Ceiling();
        CeilingFanSlot ceilingFanSlot = new CeilingFanSlot(ceiling);
        RemoteControl remoteControl = new RemoteControl(emptySlot, emptySlot, ceilingFanSlot);
        remoteControl.on(RemoteSlot.TWO);
        assertEquals(CeilingSpeed.High, ceiling.getSpeed());
    }



    @Test
    public void should_turn_off_ceiling_when_press_second_off_button() throws InvalidSlotException {
        Ceiling ceiling = new Ceiling();
        CeilingFanSlot ceilingFanSlot = new CeilingFanSlot(ceiling);
        RemoteControl remoteControl = new RemoteControl(emptySlot, emptySlot, ceilingFanSlot);
        remoteControl.off(RemoteSlot.TWO);
        assertEquals(CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button() throws InvalidSlotException {
        Stereo stereo = new Stereo();
        StereoSlot stereoSlot = new StereoSlot(stereo);
        RemoteControl remoteControl = new RemoteControl(emptySlot, emptySlot, emptySlot, stereoSlot);
        remoteControl.on(RemoteSlot.THREE);
        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button() throws InvalidSlotException {
        Stereo stereo = new Stereo();
        StereoSlot stereoSlot = new StereoSlot(stereo);
        RemoteControl remoteControl = new RemoteControl(emptySlot, emptySlot, emptySlot, stereoSlot);
        remoteControl.off(RemoteSlot.THREE);
        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getCdStatus());
        assertEquals(0, stereo.getVolume());
    }


}
