package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class DeliveryManager implements DeliveryService{

    Map<String, Delivery> orderTracking; //order storage
    Map<String, Courier> courierTracking;
    Courier[] courier;

    public DeliveryManager(int couriers){
        orderTracking = new HashMap<>();
        courierTracking = new HashMap<>();
        courier = new Courier[couriers];
        for(int i = 0; i < couriers; i++){
            courier[i] = new Courier(i + 1, "Courier - " + (i+1));
        }
    }

    @Override
    public void createOrder(Delivery delivery) {
        if (orderTracking.containsKey(delivery.getOrderId())){
            throw new IllegalArgumentException("Order with this ID already exists");
        }
        orderTracking.put(delivery.getOrderId(), delivery);
    }

    @Override
    public void assignCourier(String orderId) {
        if(courierTracking.containsKey(orderId)){
            throw new IllegalArgumentException("Courier already assigned to this order");
        }
        if(orderTracking.containsKey(orderId)){
            for(Courier couriers : courier){
                if(couriers.isAvailable()){
                    couriers.assignCourier();
                    courierTracking.put(orderId, couriers);
                    return;
                }
            }
            throw new IllegalStateException("No courier available at the moment");

        }else{
            throw new IllegalArgumentException("This order ID doesn't exist");
        }
    }

    @Override
    public void pickUpOrder(String orderId) {
        if(!orderTracking.containsKey(orderId)){
            throw new IllegalArgumentException("Order doesn't exist");
        }
        if(!courierTracking.containsKey(orderId)){
            throw new IllegalArgumentException("Courier not assigned yet");
        }
        orderTracking.get(orderId).pickUpOrder();
    }

    @Override
    public void deliverOrder(String orderId) {
        if(!orderTracking.containsKey(orderId)){
            throw new IllegalArgumentException("Order doesn't exist");
        }
        if(!courierTracking.containsKey(orderId)){
            throw new IllegalArgumentException("Courier not assigned yet");
        }
        orderTracking.get(orderId).markDelivered();
        courierTracking.get(orderId).releaseCourier();
        courierTracking.remove(orderId);
    }

    @Override
    public void showAllOrders() {
        if(orderTracking.isEmpty()){
            System.out.println("No orders available");
            return;
        }
        for(String orderId : orderTracking.keySet()){
            Delivery delivery = orderTracking.get(orderId);
            System.out.println("Order id: " + orderId + "\nCustomer name: " + delivery.getCustomerName() + "\nDelivery Status: " + delivery.getDeliveryStatus() + "\nDelivery charge: " + delivery.calculateDeliveryCharge());

            if (courierTracking.containsKey(orderId)){
                Courier courier = courierTracking.get(orderId);
                System.out.println("Courier name: " + courier.getName());
            } else {
                System.out.println("Courier not assigned");
            }
            System.out.println("-------------------------------------------------------");
        }

    }
}
