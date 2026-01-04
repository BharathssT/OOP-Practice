# OOP + Collections Practice – Student Registry

This project is a simple Java application designed to strengthen understanding of **Object-Oriented Programming (OOP)** and the **Collections Framework**.  
It models a student registry system where each student has a name, major, and a list of enrolled courses.

---

## 🎯 Project Overview

The Student Registry allows you to:

- Add new students
- Show all students
- Search for a student by name
- Filter students by academic major
- Remove a student
- Add courses to individual students

This project is a direct extension of the earlier *Pet Registry* program, introducing **lists inside objects**, which is a very common real-world pattern.

---

## 🧱 Class Structure

### `Student`
Represents a student with:

**Fields:**
- `name` – student’s full name
- `major` – academic major (e.g., "Bachelor of Commerce")
- `courses` – a `List<String>` containing enrolled course names

**Methods:**
- `addCourse(String course)` – adds a course to the student
- `getName()` – returns the student's name
- `getMajor()` – returns the major
- `getCourses()` – returns the course list
- `showInfo()` – prints name, major, and enrolled courses

Each student starts with **an empty course list** until courses are added.

---

### `StudentRegistry`
Responsible for storing and managing all student objects.

**Fields:**
- `students` – a `List<Student>` that holds all registered students

**Methods:**

- `addStudent(Student student)`  
  Adds a new student to the registry.

- `showAllStudents()`  
  Loops through all students and prints their details.

- `findStudentByName(String name)`  
  Returns the `Student` whose name matches the input, or `null` if not found.

- `filterByMajor(String major)`  
  Prints all students whose major matches the given argument.

- `removeStudent(String name)`  
  Finds and removes the first student with the given name.

---

### `StudentRegistryMain`
This class demonstrates the system's features.

It:

1. Creates several Student objects
2. Adds them to the StudentRegistry
3. Assigns courses to each student
4. Displays all students
5. Searches for a specific student
6. Filters students by major
7. Removes a student
8. Displays remaining students

This simulates a small real-world data management system.

---

## 🎓 Learning Objectives

This project helps strengthen:

- Working with **lists of objects**
- Using **composition** (`Student` has a list of `courses`)
- Implementing search and filter operations
- Safe removal from a list
- Understanding object interactions across multiple classes
- Practicing clean code structure

It mimics how service classes manage data in frameworks like **Spring Boot**.

---

## 🔜 Optional Improvements

Here are some suggested extensions:

- Validate duplicate students
- Prevent a student from enrolling in the same course twice
- Add a method to drop a course
- Create a `Course` class instead of using strings
- Use `Map<String, Student>` keyed by student name
- Convert methods to use **Stream API** (for practice later)
- Throw custom exceptions when:
    - Student is not found
    - Course already exists

---

This project builds a solid foundation for more complex OOP + Collections work and prepares you for real application structures you'll see in enterprise Java and Spring Boot development.
