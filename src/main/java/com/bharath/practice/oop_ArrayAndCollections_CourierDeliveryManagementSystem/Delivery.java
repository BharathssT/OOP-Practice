package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

public abstract class Delivery {
    private String orderId;
    private String customerName;
    private boolean pickedUp;
    private boolean delivered;

    public Delivery(String orderId, String customerName){
        this.orderId = orderId;
        this.customerName = customerName;
        this.pickedUp = false;
        this.delivered = false;
    }

    public String getOrderId(){return  orderId;}
    public String getCustomerName(){return customerName;}
    public boolean isPickedUp(){return pickedUp;}
    public boolean isDelivered(){return delivered;}

    public abstract double calculateDeliveryCharge();

    public void pickUpOrder(){
        if(delivered){
            throw new IllegalStateException("The order has already been delivered");
        } else if (pickedUp) {
            throw new IllegalStateException("The order has already been picked up");
        }else{
            pickedUp = true;
        }
    }

    public void markDelivered(){
        if(!pickedUp){
            throw new IllegalStateException("The order has not been picked up yet");
        } else if (delivered) {
            throw new IllegalStateException("The order has already been delivered");
        } else {
            delivered = true;
        }
    }

    public String getDeliveryStatus(){
        if(delivered){
            return "Delivered";
        } else if (pickedUp) {
            return "Picked up";
        } else {
            return "Created";
        }
    }
}
