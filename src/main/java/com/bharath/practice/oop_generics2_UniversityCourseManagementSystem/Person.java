package com.bharath.practice.oop_generics2_UniversityCourseManagementSystem;

public abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){return id;}
    public String getName(){return name;}

    public abstract String getRole();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Role: " + getRole();
    }

}
