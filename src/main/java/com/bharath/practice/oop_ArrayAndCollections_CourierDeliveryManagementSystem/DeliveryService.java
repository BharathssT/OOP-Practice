package com.bharath.practice.oop_ArrayAndCollections_CourierDeliveryManagementSystem;

public interface DeliveryService {

    public void createOrder(Delivery delivery);
    public void assignCourier(String orderId);
    public void pickUpOrder(String orderId);
    public void deliverOrder(String orderId);
    public void showAllOrders();

}
