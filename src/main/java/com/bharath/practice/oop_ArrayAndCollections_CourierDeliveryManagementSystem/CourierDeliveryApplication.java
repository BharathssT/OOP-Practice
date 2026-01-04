package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

public class CourierDeliveryApplication {
    public static void main(String[] args) {

        // Use interface reference (important)
        DeliveryService deliveryService = new DeliveryManager(3);

        // Create orders
        Delivery order1 = new LocalDelivery("ORD-101", "Bharath");
        Delivery order2 = new InternationalDelivery("ORD-102", "Sharath", 120);
        Delivery order3 = new LocalDelivery("ORD-103", "Deepika");

        // Register orders
        deliveryService.createOrder(order1);
        deliveryService.createOrder(order2);
        deliveryService.createOrder(order3);

        // Assign couriers
        deliveryService.assignCourier("ORD-101");
        deliveryService.assignCourier("ORD-102");

        // Pick up orders
        deliveryService.pickUpOrder("ORD-101");
        deliveryService.pickUpOrder("ORD-102");

        // Deliver one order
        deliveryService.deliverOrder("ORD-101");

        // Show all orders
        System.out.println("\n--- CURRENT ORDER STATUS ---");
        deliveryService.showAllOrders();

    }
}
