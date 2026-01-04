package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

public class LocalDelivery extends Delivery{

    private static final double FIXED_CHARGE = 50.0;

    public LocalDelivery(String orderId, String customerName){
        super(orderId,customerName);
    }

    @Override
    public double calculateDeliveryCharge(){
        return FIXED_CHARGE;
    }
}
