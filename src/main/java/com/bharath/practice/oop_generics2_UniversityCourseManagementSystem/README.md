# University Course Management System (Java)

## Overview
The University Course Management System is a simple Java mini project created to practice **Object-Oriented Programming (OOP)** concepts along with **Java Generics**, including **upper bounds**, **lower bounds**, and **wildcards**.

The project focuses on understanding how generics work with inheritance hierarchies in a clean and practical way.

---

## Objectives
- Practice core OOP principles
- Understand Java Generics and wildcard usage
- Learn upper-bounded (`extends`) and lower-bounded (`super`) generics
- Apply polymorphism with generic collections
- Write clean, reusable, and type-safe code

---

## OOP Concepts Used
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

---

## Generics Concepts Used
- Bounded type parameters (`T extends Person`)
- Upper-bounded wildcards (`? extends Person`)
- Lower-bounded wildcards (`? super Student`)
- Unbounded wildcards (`?`)
- PECS principle (Producer Extends, Consumer Super)

---

## Class Design

### Person (Abstract Class)
- Base class for all university members
- Contains common fields like `id` and `name`
- Declares an abstract `getRole()` method
- Overrides `toString()` for meaningful object representation

### Student
- Extends `Person`
- Represents a student with a major

### TeachingAssistant
- Extends `Student`
- Represents a student with teaching responsibilities

### Professor
- Extends `Person`
- Represents a professor with a subject specialization

### UniversityUtils (Utility Class)
- Demonstrates wildcard generics usage
- Contains methods using:
    - `? extends Person` for read-only operations
    - `? super Student` for write operations
    - `?` for generic list inspection

### Main
- Acts as the application entry point
- Demonstrates all OOP and generics features together

---

## Functional Features
- Add students safely to collections using lower-bounded wildcards
- Read and display roles using upper-bounded wildcards
- Print any type of list using unbounded wildcards
- Demonstrate polymorphism through generic collections

---

## Learning Outcome
By completing this project, you will gain:
- A strong understanding of Java Generics
- Confidence in using wildcard bounds correctly
- Practical experience with OOP design
- Ability to explain PECS and bounded wildcards clearly

---

(Java OOP & Generics Practice Project)
