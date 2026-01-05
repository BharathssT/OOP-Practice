package com.bharath.practice.oop_generics2_UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create some people
        Student student1 = new Student(1, "Alice", "Computer Science");
        Student student2 = new Student(2, "Bob", "Information Technology");
        TeachingAssistant ta1 = new TeachingAssistant(3, "Charlie", "Computer Science", "CS Dept");
        Professor professor1 = new Professor(4, "Dr. Smith", "Software Engineering");

        // Create lists
        List<Person> people = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        // Utility class usage
        UniversityUtils utils = new UniversityUtils();

        // ? super Student → add students safely
        utils.addStudentToList(people, student1);
        utils.addStudentToList(people, ta1);      // TA is also a Student
        utils.addStudentToList(students, student2);

        System.out.println("\n--- Printing People Roles (? extends Person) ---");
        utils.printPeopleRoles(people);

        System.out.println("\n--- Printing Any List (? wildcard) ---");
        utils.printList(people);
        utils.printList(students);

        // You can also pass different lists
        List<Professor> professors = new ArrayList<>();
        professors.add(professor1);

        System.out.println("\n--- Printing Professors (? extends Person) ---");
        utils.printPeopleRoles(professors);
    }
}
