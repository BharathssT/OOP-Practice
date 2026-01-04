package com.bharath.practice.oop_collection4_InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    Map<Integer, Product> inventory = new HashMap<>();
    //key productId, value Product

    public void addProduct(Product product){

        int id = product.getProductId();
        if(inventory.containsKey(id)){
            throw new IllegalArgumentException("Product with id: " + id + " already exists in the inventory");
        }
        inventory.put(id, product);
    }

    public Product getProductByID(int id){
        if(!inventory.containsKey(id)){
            throw new IllegalArgumentException("Product with id: " + id + " doesn't exists");
        }

        return inventory.get(id);
    }

    public void viewAllProducts(){

        for(Product product : inventory.values()){
            System.out.println(product);
        }
    }

}
