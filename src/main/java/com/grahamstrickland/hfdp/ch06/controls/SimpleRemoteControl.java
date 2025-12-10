package com.grahamstrickland.hfdp.ch06.controls;
import com.grahamstrickland.hfdp.ch06.commands.Command;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
