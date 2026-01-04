package com.bharath.practice.oop_collection2_studentregistry;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String major;
    private List<String> courses;

    public Student(String name, String major){

        this.name = name;
        this.major = major;
        this.courses = new ArrayList<>();

    }

    public String getName(){return name;}
    public String getMajor(){return major;}
    public List<String> getCourses(){return courses;}

    public void addCourse(String course){
        courses.add(course);
    }

    public void showInfo() {
        System.out.println("Name of the student: " + name);
        System.out.println("Major: " + major);

        if (courses.isEmpty()){
            System.out.println("Courses: No courses enrolled yet");
        } else {
            System.out.println("Courses Enrolled: ");
            for(String course : courses){
                System.out.println(" - " + course);
            }
        }

    }
}


