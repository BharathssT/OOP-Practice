package com.bharath.practice.oop_exceptionHandling2_OnlineOrderProcessingSystem;

public class StorePickupOrder extends Order{
    String storeLocation;

    public StorePickupOrder(String orderId, String customerName, double amount, String status, String storeLocation) {
        super(orderId, customerName, amount, status);
        this.storeLocation = storeLocation;
    }

    @Override
    public void getOrderDetails(){
        System.out.println("Order id: " + getOrderId() + "\n Customer name: " + getCustomerName() + "\n Amount: " + getAmount() + "\n Status: " + getStatus() + "\n Store Location: " + storeLocation);
    }
}
