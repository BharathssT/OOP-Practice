package com.bharath.practice.oop_generics2_UniversityCourseManagementSystem;

public class TeachingAssistant extends Student{
    private String department;

    public TeachingAssistant(int id, String name, String major, String department) {
        super(id, name, major);
        this.department = department;
    }

    @Override
    public String getRole() {
        return "This is a Teaching Assistant";
    }


}
