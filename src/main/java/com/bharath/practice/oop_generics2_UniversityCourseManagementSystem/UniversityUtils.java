package com.bharath.practice.oop_generics2_UniversityCourseManagementSystem;

import java.util.List;

public class UniversityUtils {

    public void printPeopleRoles(List<? extends Person> people){
        for(int i = 0; i < people.size(); i++){
            System.out.println("Name: " + people.get(i).getName() + "\nRole: " + people.get(i).getRole());
        }
    }

    public void addStudentToList(List<? super Student> list, Student student){
        list.add(student);
        System.out.println("The Student has been added to the list");
    }

    public void printList(List<?> list){
        for(Object element : list){
            System.out.println(element);
        }
    }
}
