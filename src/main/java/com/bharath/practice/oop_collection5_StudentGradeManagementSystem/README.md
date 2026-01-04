# 🎓 Student Grade Management System

## 📝 Overview
The **Student Grade Management System** is a simple Core Java console application designed to manage and retrieve student grades using an in-memory data structure.

This project focuses on practicing **Java Collections (Map)** along with **Object-Oriented Programming (OOP)** principles and **basic exception handling**.  
It is intentionally kept small and easy to understand to help learners gain confidence with Maps before moving on to more complex systems.

---

## 🎯 Purpose of the Project
The main goals of this project are to:
- Understand how `Map` works in real-world scenarios
- Store and retrieve objects using a unique key
- Practice clean class design and responsibility separation
- Apply simple exception handling in a service layer
- Strengthen Core Java fundamentals

---

## 🧠 Concepts Covered
- Object-Oriented Programming (OOP)
- Encapsulation
- Java Collections Framework
    - `Map`
    - `HashMap`
- Key–Value data storage
- Method design and return types
- Basic exception handling (`IllegalArgumentException`)

---

## ⚙️ Functional Features
The system supports the following operations:

- **Add Student**
    - Adds a student along with their grade to the system
    - Prevents duplicate student IDs

- **Get Student Grade**
    - Retrieves a student’s grade using their unique ID
    - Handles cases where the student does not exist

- **View All Students**
    - Displays all students and their corresponding grades

---

## 🧱 High-Level Design
The application follows a simple layered structure:

- **Model Layer**
    - Represents student data (ID, name, grade)

- **Service Layer**
    - Manages student records using a `Map`
    - Applies validation and throws exceptions for invalid operations

- **Application Layer**
    - Acts as the entry point
    - Calls service methods
    - Handles exceptions and prints output

---

## 🚨 Error Handling
Basic error handling is implemented to:
- Prevent adding students with duplicate IDs
- Handle requests for non-existing students

Exceptions are thrown from the **service layer** and handled in the **application layer**, following good design practices.

---

## 🎓 Who This Project Is For
This project is suitable for:
- Java beginners
- Learners practicing Java Collections
- Developers strengthening Core Java before frameworks like Spring
- Anyone wanting hands-on experience with Maps in a simple setup

---

## 🚀 Possible Enhancements
Some potential improvements include:
- Updating a student’s grade
- Removing a student
- Calculating average grade
- Sorting students by grade
- Introducing custom exception classes

---

## 🏁 Conclusion
The Student Grade Management System is a beginner-friendly project that bridges the gap between theoretical knowledge of Java Maps and practical implementation.

It serves as a solid stepping stone toward more complex Java applications and backend development concepts.

---
