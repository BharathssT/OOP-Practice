package com.bharath.practice.oop_collection3_smarthome;

public class Light extends Device implements Controllable {

    int brightness = 0;
    String color = "White";

    public Light(String id, String name, String location) {
        super(id, name, location);
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void status() {
        String state = isOnline() ? "ON" : "OFF";
        System.out.println("The " + getName() + " is " + state + " at " + getLocation() + " | brightness: " + brightness + " | Color: " + color);
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
        return "The Light is: " + (isOnline() ? "ON" : "OFF");
    }
}
