package com.bharath.practice.oop_collection2_studentregistry;

public class StudentRegistryMain {

    public static void main(String[] args){

        StudentRegistry registry = new StudentRegistry();


        Student sharath = new Student("Sharath Santosh", "Bachelor of Arts");
        Student sharan = new Student("Sharan Sanjay Kumar", "Bachelor of Science");
        Student karthik = new Student("Karthik Sai Kumar", "Bachelor of Commerce");
        Student surya = new Student("Surya Narayana", "Bachelor of Commerce");
        Student shyam = new Student("Megha Shyam", "Bachelor of Computer Applications");

        registry.addStudent(sharath);
        registry.addStudent(sharan);
        registry.addStudent(karthik);
        registry.addStudent(surya);
        registry.addStudent(shyam);

        sharath.addCourse("Civics");
        sharath.addCourse("Economics");
        sharan.addCourse("Physics");
        sharan.addCourse("Chemistry");
        karthik.addCourse("Accountancy");
        karthik.addCourse("Taxation");
        surya.addCourse("Accountancy");
        surya.addCourse("Taxation");
        shyam.addCourse("Java");
        shyam.addCourse("Python");

        System.out.println("Showing all the students:");
        registry.showAllStudents();

        System.out.println("\n Finding student by name:");
        Student find = registry.findStudentByName("Megha Shyam");
        if(find != null) find.showInfo();

        System.out.println("\n Filter by major (Bachelor of Commerce)");
        registry.filterByMajor("Bachelor of Commerce");

        System.out.println("\n Removing a student");
        registry.removeStudent("Sharath Santosh");


        System.out.println("\n Showing the remaining students:");
        registry.showAllStudents();

    }
}
