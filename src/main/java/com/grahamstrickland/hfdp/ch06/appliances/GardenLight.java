package com.grahamstrickland.hfdp.ch06.appliances;
import java.util.Date;

public class GardenLight extends Light {
    private Date duskTime = new Date();
    private Date dawnTime = new Date();

    public GardenLight() {
        super("Garden");

        duskTime.setTime((duskTime.getTime() % 43200000L) + 43200000L);
        dawnTime.setTime(dawnTime.getTime() % 43200000L);
    }

    public void setDuskTime(int time) {
        assert(time <= 6);
        duskTime.setTime((duskTime.getTime() % 43200000L) + 43200000L + time);
        System.out.println("Garden Light dusk time set to " + duskTime.toString());
    }

    public void setDawnTime(int time) {
        assert(time <= 6);
        dawnTime.setTime((dawnTime.getTime() % 43200000L) + time);
        System.out.println("Garden Light dawn time set to " + dawnTime.toString());
    }

    public void manualOn() {
        super.on();
    }

    public void manualOff() {
        super.off();
    }
}
