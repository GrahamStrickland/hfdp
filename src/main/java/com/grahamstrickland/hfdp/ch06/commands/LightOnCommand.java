package com.grahamstrickland.hfdp.ch06.commands;
import com.grahamstrickland.hfdp.ch06.appliances.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
