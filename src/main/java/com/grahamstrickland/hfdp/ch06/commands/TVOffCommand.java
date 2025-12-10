package com.grahamstrickland.hfdp.ch06.commands;
import com.grahamstrickland.hfdp.ch06.appliances.TV;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }
    
    public void undo() {
        tv.on();
    }
}
