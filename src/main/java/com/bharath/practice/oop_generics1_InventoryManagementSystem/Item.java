package com.bharath.practice.oop_generics1_InventoryManagementSystem;

public abstract class Item {
    private int id;
    private String name;

    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){return id;}
    public String getName(){return name;}

    public abstract void displayInfo();
}
