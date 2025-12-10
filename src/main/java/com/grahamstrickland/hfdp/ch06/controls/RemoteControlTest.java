package com.grahamstrickland.hfdp.ch06.controls;
import com.grahamstrickland.hfdp.ch06.appliances.GarageDoor;
import com.grahamstrickland.hfdp.ch06.appliances.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("House");

        remote.setCommand(() -> light.on());
        remote.buttonWasPressed();
        remote.setCommand(() -> garageDoor.up());
        remote.buttonWasPressed();
    }   
}
