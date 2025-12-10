package com.grahamstrickland.hfdp.ch06.appliances;
public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " Door is Open");
    } 

    public void down() {
        System.out.println(location + " Door is Closed");
    }

    public void stop() {
        System.out.println(location + " Door is Stopped");
    }

    public void lightOn() {
        System.out.println(location + " Door Light is On");
    }

    public void lightOff() {
        System.out.println(location + " Door Light is Off");
    }
}
