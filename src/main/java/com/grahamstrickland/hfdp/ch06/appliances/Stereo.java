package com.grahamstrickland.hfdp.ch06.appliances;
public class Stereo {
    private String location;
    private int volume;

    public Stereo(String location) {
        this.location = location;
        this.volume = 0;
    }

    public void on() {
        System.out.println(location + " Stereo is On");
    }
    
    public void off() {
        System.out.println(location + " Stereo is Off");
    }

    public void setCd() {
        System.out.println(location + " Stereo set to CD");
    }

    public void setDvd() {
        System.out.println(location + " Stereo set to DVD");
    }

    public void setRadio() {
        System.out.println(location + " Stereo set to Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " Stereo volume set to " + this.volume);
    }
}
