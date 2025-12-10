package com.grahamstrickland.hfdp.ch06.commands;
import com.grahamstrickland.hfdp.ch06.appliances.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }
    
    public void undo() {
        tv.off();
    }
}
