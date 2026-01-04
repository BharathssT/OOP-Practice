package com.bharath.practice.oop_exceptionHandling2_OnlineOrderProcessingSystem;

public class OrderApplication {

    public static void main(String[] args){

        OnlineOrder onlineOrder = new OnlineOrder("01", "MeghaShyam Thota", 250.00, "Created", "Marathalli, Bangalore");
        StorePickupOrder storePickupOrder = new StorePickupOrder("02", "RamaShyam Thota", 200, "Processed", "Majestic, Bangalore");

        try {
            onlineOrder.processOrder();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            storePickupOrder.processOrder();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        onlineOrder.getOrderDetails();

    }
}
