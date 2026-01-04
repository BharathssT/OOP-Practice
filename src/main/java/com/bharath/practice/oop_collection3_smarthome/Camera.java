package com.bharath.practice.oop_collection3_smarthome;

public class Camera extends Device implements Controllable {

    public Camera(String id, String name, String location) {
        super(id, name, location);
    }

    public void startRecording(){
        setStatus(true);
    }

    public void stopRecording(){
        setStatus(false);
    }

    @Override
    public void turnOn() {
        startRecording();
        System.out.println("The " + getName() + " started recording at " + getLocation());
    }

    @Override
    public void turnOff() {
        stopRecording();
        System.out.println("The " + getName() + " stopped recording at " + getLocation());
    }

    @Override
    public String getStatus() {
        return "The Camera is: " + (isOnline() ? "Recording" : "Idle");
    }

    @Override
    public void status() {
        String state = isOnline() ? "Recording" : "Idle";
        System.out.println("The " + getName() + " is " + state + " at " + getLocation());
    }
}
