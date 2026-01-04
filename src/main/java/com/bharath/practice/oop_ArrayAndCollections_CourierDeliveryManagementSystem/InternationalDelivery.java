package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

public class InternationalDelivery extends Delivery{

    private double distanceInKm;
    private static final double RATE_PER_KM = 10.00;

    public InternationalDelivery(String orderId, String customerName, double distanceInKm){
        super(orderId, customerName);

        if(distanceInKm <= 0){
            throw new IllegalArgumentException("Distance must be greater than zero");
        }
        this.distanceInKm = distanceInKm;
    }

    @Override
    public double calculateDeliveryCharge(){
        return distanceInKm * RATE_PER_KM;
    }
}
