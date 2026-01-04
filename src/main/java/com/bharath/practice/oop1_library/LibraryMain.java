package com.bharath.practice.oop1_library;

public class LibraryMain {
    public static void main(String[] args){

        LibraryMember bharath = new StudentMember("Bharath", 121);
        LibraryMember shyam = new StudentMember("Shyam", 141);

        bharath.showDetails();
        bharath.borrowBook();

        System.out.println();

        shyam.showDetails();
        shyam.borrowBook();
    }
}
