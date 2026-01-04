package com.bharath.practice.oop_generics1_InventoryManagementSystem;

public class Book extends Item{
    private String author;

    public Book(int id, String name,String author){
        super(id, name);
        this.author = author;
    }

    @Override
    public void displayInfo(){
        System.out.println("Book: " + getName() + "\nAuthor: " + author);
    }
}
