package com.bharath.practice.oop_generics2_UniversityCourseManagementSystem;

public class Professor extends Person{
    private String subject;

    public Professor(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    @Override
    public String getRole() {
        return "This is a Professor";
    }
}
