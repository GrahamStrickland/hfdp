package com.grahamstrickland.hfdp.ch12.controllers.interfaces;

public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
