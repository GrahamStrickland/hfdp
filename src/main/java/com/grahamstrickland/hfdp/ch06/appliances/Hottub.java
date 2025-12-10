package com.grahamstrickland.hfdp.ch06.appliances;
public class Hottub {
    private int temperature;

    public Hottub() {
        temperature = 95;
    }
    
    public void circulate() {
        System.out.println("Hottub is circulating");
    }

    public void jetsOn() {
        System.out.println("Hottub Jets are on");
    }

    public void jetsOff() {
        System.out.println("Hottub Jets are off");
    }

    public void setTemperature(int temperature) {
        System.out.println("Hottub temperature is " + this.temperature + "F");
    }
}
