package com.grahamstrickland.hfdp.ch06.appliances;
public class Thermostat {
    private String location;
    private int temperature;

    public Thermostat(String location) {
        this.location = location;
        temperature = 95;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(location + " Thermostat set to " + this.temperature + "F");
    }
}
