package com.bharath.practice.oop_collection4_InventoryManagementSystem;

public class Product {

    private int productId;
    private String productName;
    private int quantity;

    public Product(int productId, String productName, int quantity){

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;

    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return "Product id: " + productId + "\nProduct Name: " + productName + "\nQuantity: " + quantity;
    }
}
