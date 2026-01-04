package com.bharath.practice.oop_collection3_smarthome;

public abstract class  Device {

    private String id, name, location;
    private boolean online;

    public Device(String id, String name, String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public abstract void status();

    public String getId(){return id;}
    public String getName(){return name;}
    public String getLocation(){return location;}
    public boolean isOnline(){return online;}

    public void setStatus(boolean status){
        this.online = status;
    }

    public void showDetails(){
        System.out.println("The " + name + " is at the " + location);
    }
}
