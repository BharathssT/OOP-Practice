package com.bharath.practice.oop_generics1_InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item> {
    //manages a collection of items of any type

    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
        System.out.println("Item added successfully");
    }

    public void removeItem(int id){
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getId()==id){
                items.remove(i);
                System.out.println("The item has been removed");
                return;
            }
        }
    }

    public void displayItems(){
        for(T item :  items){
            item.displayInfo();
        }
    }
}
