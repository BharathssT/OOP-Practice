package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

public class Courier {

    private int courierId;
    private String name;
    private boolean available;

    public Courier(int courierId, String name){
        this.courierId = courierId;
        this.name = name;
        this.available = true;
    }

    public int getCourierId(){return courierId;}
    public String getName(){return name;}
    public boolean isAvailable(){return available;}

    public void assignCourier(){
        if(!available){
            throw new IllegalStateException("The courier is already assigned");
        } else {
            available = false;
        }
    }

    public void releaseCourier(){
        if(available){
            throw new IllegalStateException("This courier is already available");
        } else {
            available = true;
        }
    }
}
