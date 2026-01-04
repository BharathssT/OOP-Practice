package com.bharath.practice.oop_collection3_smarthome;

public class Thermostat extends Device implements Controllable{

    double currentTemp = 0;
    double targetTemp = 0;

    public Thermostat(String id, String name, String location) {
        super(id, name, location);
    }

    public void setTargetTemp(Double temp){
        this.targetTemp = temp;
    }

    public void setCurrentTemp(Double temp){
        this.currentTemp = temp;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("The " + getName() + " is turned on at " + getLocation());
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("The " + getName() + " is turned off at " + getLocation());
    }

    @Override
    public String getStatus() {
        return "The Thermostat is: " + (isOnline() ? "ON" : "OFF");
    }

    @Override
    public void status() {
        String state = isOnline() ? "ON" : "OFF";
        System.out.println("The " + getName() + " is " + state + " at " + getLocation() + " | Current Temperature: " + currentTemp);
    }
}
