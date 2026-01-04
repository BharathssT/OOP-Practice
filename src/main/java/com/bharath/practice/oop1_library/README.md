# OOP Practice – Library Membership System

A small Java project created to practice core Object-Oriented Programming concepts such as abstraction, inheritance, and polymorphism.

## 📘 Project Summary
This simple system models library members who borrow books for different durations.  
It demonstrates:
- Abstract classes
- Method overriding
- Encapsulation
- Polymorphism

## 🧱 Class Overview

### **LibraryMember (abstract)**
- Fields: `name`, `memberId`
- Methods:
    - `borrowBook()` (abstract)
    - `showDetails()`
    - protected getters

### **StudentMember**
- Extends `LibraryMember`
- Implements `borrowBook()` with a 7-day duration

### **TeacherMember**
- Extends `LibraryMember`
- Implements `borrowBook()` with a 30-day duration

### **LibraryMain**
- Creates different types of `LibraryMember`
- Calls `showDetails()` and `borrowBook()` to demonstrate polymorphism

## 🎯 Learning Goals
- Practice using abstract classes and inheritance
- Understand how polymorphism works through superclass references
- Strengthen Java class design fundamentals

## 🔜 Next Steps
This project can be extended by adding:
- A `Book` class
- Overloaded `borrowBook(Book book)`
- More member types
- Collection-based storage of members (next practice module)
