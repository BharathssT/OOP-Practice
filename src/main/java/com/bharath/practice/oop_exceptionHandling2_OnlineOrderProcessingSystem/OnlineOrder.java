package com.bharath.practice.oop_exceptionHandling2_OnlineOrderProcessingSystem;

public class OnlineOrder extends Order{

    String deliveryAddress;

    public OnlineOrder(String orderId, String customerName, double amount, String status, String deliveryAddress) {
        super(orderId, customerName, amount, status);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void getOrderDetails(){
        System.out.println("Order id: " + getOrderId() + "\n Customer name: " + getCustomerName() + "\n Amount: " + getAmount() + "\n Status: " + getStatus() + "\n Delivery address: " + deliveryAddress);
    }
}
