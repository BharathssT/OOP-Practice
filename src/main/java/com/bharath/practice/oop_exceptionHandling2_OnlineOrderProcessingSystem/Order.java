package com.bharath.practice.oop_exceptionHandling2_OnlineOrderProcessingSystem;

public class Order {

    private String orderId;
    private String customerName;
    private double amount;
    private String status;

    public Order(String orderId, String customerName, double amount, String status){
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    public String getOrderId(){return orderId;}
    public String getCustomerName(){return customerName;}
    public double getAmount(){return amount;}
    public String getStatus(){return status;}

    public void processOrder(){
        if(status.equalsIgnoreCase("Created")){
            status = "Processed";
            System.out.println("Order processed successfully");
        } else {
            throw new IllegalStateException("Order cannot be processed in current state" + status);
        }
    }

    public void cancelOrder(){
        if(status.equalsIgnoreCase("Created")){
            status = "Cancelled";
            System.out.println("Order cancelled successfully");
        } else {
            throw new IllegalStateException("Order cannot be cancelled in current state" + status);
        }
    }

    public void getOrderDetails(){
        System.out.println("Order id: " + orderId + "\n Customer name: " + customerName + "\n Amount: " + amount + "\n Status: " + status);
    }
}
