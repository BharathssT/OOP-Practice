package com.bharath.practice.oop1_library;

public class TeacherMember extends LibraryMember{

    public TeacherMember(String name, int id){
        super(name, id);
    }

    @Override
    public void borrowBook() {
        System.out.println("Teacher: " + getName() + "," + " borrowed a book for 30 days");
    }
}
