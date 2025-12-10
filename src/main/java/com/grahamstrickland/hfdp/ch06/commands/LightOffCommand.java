package com.grahamstrickland.hfdp.ch06.commands;
import com.grahamstrickland.hfdp.ch06.appliances.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
