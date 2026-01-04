# Generic Inventory Management System (Java)

## Overview
The Generic Inventory Management System is a simple Java mini project created to practice Object-Oriented Programming (OOP) concepts along with Java Generics. It demonstrates how a single inventory manager can store and manage multiple types of items in a reusable and type-safe manner. This project is intended for learning and practice purposes.

## Objectives
- Practice core OOP principles
- Understand and apply Java Generics
- Work with Java Collections
- Design clean and extensible class structures

## OOP Concepts Used
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Generics

## Design Overview
The system is based on an abstract Item class that represents a generic inventory item. Concrete item types such as Book and Electronic extend this base class and provide their own specific details. A generic Inventory class manages a collection of items using Java Generics, ensuring type safety and reusability. A Main class acts as the driver to demonstrate system functionality.

## Functional Features
- Add items to the inventory
- Remove items using a unique ID
- Display all inventory items
- Manage different item types using a single inventory implementation

## Project Structure
Item (abstract)  
↳ Book  
↳ Electronic

Inventory<T extends Item>  
Main

## Possible Enhancements
- Add more item types
- Implement searching and sorting
- Create a menu-driven console interface
- Add file-based storage
- Introduce custom exceptions

## Learning Outcome
This project helps build a strong foundation in Java OOP design, generics, safe collection handling, and extensible system development.

(Java OOP & Generics Practice Project)
