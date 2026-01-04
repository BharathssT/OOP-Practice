package com.bharath.practice.oop_collection3_smarthome;

public class DoorLock extends Device implements Controllable {


    public DoorLock(String id, String name, String location) {
        super(id, name, location);
    }

    public void lock(){
        setStatus(true);
    }

    public void unlock(){
        setStatus(false);
    }

    @Override
    public void turnOn() {
        lock();
        System.out.println("The " + getName() + " has been locked at " + getLocation());
    }

    @Override
    public void turnOff() {
        unlock();
        System.out.println("The " + getName() + " has been unlocked at " + getLocation());
    }

    @Override
    public String getStatus() {
        return "The Door is " + (isOnline() ? "Locked" : "Unlocked");
    }

    @Override
    public void status() {
        String state = isOnline() ? "Locked" : "Unlocked";
        System.out.println("The " + getName() + " is " + state + " at " + getLocation());
    }
}
