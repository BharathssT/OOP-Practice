package com.bharath.practice.oop_collection2_studentregistry;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void showAllStudents(){
        for(Student student : students){
            student.showInfo();
        }
    }

    public Student findStudentByName(String name){
        for(Student student : students){
            if(name.equals(student.getName())){
                return student;
            }
        }
        return null;
    }

    public void filterByMajor(String major){
        for(Student student : students){
            if(major.equals(student.getMajor())){
                student.showInfo();
            }
        }
    }

    public void removeStudent(String name){
        for(int i = 0; i < students.size(); i++){
            if(name.equals(students.get(i).getName())){
                students.remove(i);
                break;
            }
        }
    }
}
