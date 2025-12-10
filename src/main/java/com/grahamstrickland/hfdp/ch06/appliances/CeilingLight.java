package com.grahamstrickland.hfdp.ch06.appliances;
public class CeilingLight {
    private String location;

    public CeilingLight(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Ceiling Light is On");
    }

    public void off() {
        System.out.println(location + " Ceiling Light is Off");
    }
    
    public void dim() {
        System.out.println(location + " Ceiling Light is Dimmed");
    }
}
