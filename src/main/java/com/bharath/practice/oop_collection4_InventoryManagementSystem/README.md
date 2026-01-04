# 📦 Inventory Management System

## 📝 Overview
The **Inventory Management System** is a simple Core Java console application designed to manage products using an in-memory data structure.  
It focuses on practicing **Object-Oriented Programming (OOP)** concepts and the **Java Collections Framework**, specifically the **Map** interface.

This project is intentionally kept simple to help learners gain hands-on experience with Maps before moving on to more complex systems.

---

## 🎯 Purpose of the Project
The main goal of this project is to:
- Understand how `Map` works in real-world scenarios
- Practice storing and retrieving objects using unique keys
- Apply basic exception handling
- Learn proper separation of responsibilities between classes

---

## 🧠 Concepts Covered
- Object-Oriented Programming (OOP)
- Encapsulation
- Java Collections (`Map`, `HashMap`)
- Key–Value data storage
- Basic exception handling
- Clean service-layer design

---

## ⚙️ Functional Features
The system supports the following operations:

- **Add Product**
    - Adds a new product to the inventory
    - Prevents duplicate product IDs

- **Get Product by ID**
    - Retrieves product details using a unique product ID
    - Handles cases where the product does not exist

- **View All Products**
    - Displays all products currently stored in the inventory

---

## 🧱 High-Level Design
The project follows a simple layered approach:

- **Model Layer**
    - Represents product data

- **Service Layer**
    - Manages inventory operations using a Map
    - Applies business rules and validations

- **Application Layer**
    - Acts as the entry point
    - Handles user interaction and exception handling

---

## 🚨 Error Handling
Basic error handling is implemented using built-in Java exceptions:
- Prevents adding duplicate products
- Handles attempts to retrieve non-existing products

Exceptions are thrown from the service layer and handled in the application layer to maintain clean separation of concerns.

---

## 🎓 Who This Project Is For
This project is ideal for:
- Java beginners
- Developers learning Java Collections
- Anyone wanting hands-on experience with `Map`
- Learners preparing for frameworks like Spring by strengthening Core Java fundamentals

---

## 🚀 Possible Enhancements
Future improvements could include:
- Removing products from inventory
- Updating product quantity
- Adding custom exception classes
- Persisting data using files or a database
- Adding unit tests

---

## 🏁 Conclusion
The Inventory Management System serves as a foundational project for understanding how Java Maps are used in practical applications.  
It helps bridge the gap between theoretical knowledge and real coding experience.

---
