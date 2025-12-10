package com.grahamstrickland.hfdp.ch06.commands;
public interface Command {
    public void execute();
    public void undo();
}