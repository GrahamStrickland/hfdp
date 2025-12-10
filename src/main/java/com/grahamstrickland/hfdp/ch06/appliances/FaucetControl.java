package com.grahamstrickland.hfdp.ch06.appliances;
public class FaucetControl {
    private String location;

    public FaucetControl(String location) {
        this.location = location;
    }

    public void openValve() {
        System.out.println(location + " Faucet Valve is Open");
    }

    public void closeValve() {
        System.out.println(location + " Faucet Valve is Closed");
    }
}
