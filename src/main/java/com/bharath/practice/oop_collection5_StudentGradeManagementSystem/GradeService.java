package com.bharath.practice.oop_collection5_StudentGradeManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class GradeService {

    Map<Integer, Student> students = new HashMap<>();
    // Key --> Integer, Value --> Student

    public void addStudent(Student student){

        int id = student.getStudentId();
        if(students.containsKey(id)){
            throw new IllegalArgumentException("Student already exist with Id: " + id);
        }

        students.put(id, student);
    }

    public int getStudentGrade(int id){
        if(!students.containsKey(id)){
            throw new IllegalArgumentException("Student doesn't exist with Id: " + id);
        }

        Student student = students.get(id);
        return student.getGrade();

    }

    public void viewAllStudents(){
        for(Student student : students.values()){
            System.out.println(student);
        }
    }
}
