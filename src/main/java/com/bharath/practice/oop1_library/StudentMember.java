package com.bharath.practice.oop1_library;

public class StudentMember extends LibraryMember{

    public StudentMember(String name, int id){
        super(name, id);
    }

    @Override
    public void borrowBook() {
        System.out.println("Name: " + getName() + "," + " borrowed a book for 7 days");
    }
}
