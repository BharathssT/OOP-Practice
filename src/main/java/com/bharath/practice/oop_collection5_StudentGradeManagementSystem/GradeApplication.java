package com.bharath.practice.oop_collection5_StudentGradeManagementSystem;

public class GradeApplication {

    public static void main(String[] args){

        GradeService gradeService = new GradeService();

        Student student1 = new Student(1, "Sharath Kumar", 90);
        Student student2 = new Student(2, "Sampath Kumar", 80);

        try{
            gradeService.addStudent(student2);
            gradeService.addStudent(student1);
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }


        try{
            System.out.println("Student Grade with id 1: " + gradeService.getStudentGrade(1));
            System.out.println("Student Grade with id 3: "  + gradeService.getStudentGrade(3));
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

        gradeService.viewAllStudents();

    }

}
