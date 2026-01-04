package com.bharath.practice.oop_collection5_StudentGradeManagementSystem;

public class Student {

    private int studentId;
    private String studentName;
    private int grade;

    public Student(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    public String toString(){
        return "Student ID: " + studentId + "\nStudent Name: " + studentName + "\nStudent Grade: ";
    }
}
