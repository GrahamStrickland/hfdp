package com.grahamstrickland.hfdp.ch06.appliances;
public class SecurityControl {
    private String location;

    public SecurityControl(String location) {
        this.location = location;
    }

    public void arm() {
        System.out.println(location + " Security Beams are Armed");
    }

    public void disarm() {
        System.out.println(location + " Security Beams are Not Armed");
    }
}
