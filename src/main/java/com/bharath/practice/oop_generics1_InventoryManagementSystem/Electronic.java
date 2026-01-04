package com.bharath.practice.oop_generics1_InventoryManagementSystem;

public class Electronic extends Item{
    private String brand;

    public Electronic(int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronic: " + getName() + "\nBrand: " + brand);
    }
}
