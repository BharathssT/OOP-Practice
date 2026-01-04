package com.bharath.practice.oop_collection4_InventoryManagementSystem;

public class InventoryApplication {

    public static void main(String[] args){

        InventoryService inventoryService = new InventoryService();

        Product ac = new Product(1,"AC", 10);
        Product fan = new Product(2, "Fan", 20);
        Product fridge = new Product(3, "Fridge", 8);
        Product tv = new Product(4, "TV", 15);

        inventoryService.addProduct(ac);
        inventoryService.addProduct(fan);
        inventoryService.addProduct(fridge);
        inventoryService.addProduct(tv);

        try{
            System.out.println("Product by ID 5: " + inventoryService.getProductByID(5));
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        inventoryService.viewAllProducts();

    }
}
