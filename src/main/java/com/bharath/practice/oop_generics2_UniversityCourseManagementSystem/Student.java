package com.bharath.practice.oop_generics2_UniversityCourseManagementSystem;

public class Student extends Person{
    private String major;

    public Student(int id, String name, String major){
        super(id, name);
        this.major = major;
    }

    @Override
    public String getRole() {
        return "This is a Student";
    }
}
