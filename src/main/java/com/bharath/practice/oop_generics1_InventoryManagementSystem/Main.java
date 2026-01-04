package com.bharath.practice.oop_generics1_InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {

        Inventory<Item> inventory = new Inventory<>();

        Book book1 = new Book(1, "Java Basics", "James Gosling");
        Electronic laptop = new Electronic(2, "Laptop", "Dell");

        inventory.addItem(book1);
        inventory.addItem(laptop);

        System.out.println("\nInventory Items:");
        inventory.displayItems();

        inventory.removeItem(1);

        System.out.println("\nAfter Removal:");
        inventory.displayItems();
    }
}
