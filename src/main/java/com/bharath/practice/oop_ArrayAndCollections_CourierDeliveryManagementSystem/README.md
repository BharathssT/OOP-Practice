# 📦 Courier Delivery Management System

## 📖 Overview
The Courier Delivery Management System is a console-based Java application that simulates how courier deliveries are handled in a real-world system.  
The project focuses on applying Object-Oriented Programming (OOP) principles while combining arrays, collections, and exception handling.

---

## 🎯 Project Goals
- Strengthen understanding of core OOP concepts
- Practice abstraction, inheritance, and polymorphism
- Use arrays and collections together effectively
- Apply exception handling for business rules
- Understand the purpose of interfaces in design

---

## 🧠 Concepts Used
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- Interfaces
- Arrays
- Collections (`HashMap`)
- Exception Handling

---

## 🏗️ High-Level Design

### 1. Delivery (Abstract Class)
- Represents a delivery order
- Stores order ID and customer name
- Maintains delivery state (Created, Picked Up, Delivered)
- Enforces valid state transitions
- Declares method for calculating delivery charges

---

### 2. LocalDelivery & InternationalDelivery
- Concrete implementations of `Delivery`
- `LocalDelivery` uses a fixed delivery charge
- `InternationalDelivery` calculates charge based on distance
- Demonstrates polymorphism

---

### 3. Courier
- Represents a delivery agent
- Maintains availability state
- Prevents invalid assignment and release
- Manages its own state independently

---

### 4. DeliveryService (Interface)
Defines the operations supported by the system:
- Create order
- Assign courier
- Pick up order
- Deliver order
- Display all orders

Acts as a contract between the application and implementation.

---

### 5. DeliveryManager
- Implements `DeliveryService`
- Coordinates orders and couriers
- Uses:
    - `Map<String, Delivery>` to track all orders
    - `Map<String, Courier>` to track active assignments
    - `Courier[]` as a fixed courier pool
- Enforces all business rules

---

## 🔄 Application Workflow
1. Create delivery orders
2. Assign available couriers
3. Pick up orders
4. Deliver orders
5. Release couriers after delivery
6. View order status at any time

---

## 🚨 Business Rules
- Duplicate order IDs are not allowed
- Courier must be assigned before pickup
- Order must be picked up before delivery
- Couriers cannot be assigned to multiple orders at once
- Exceptions are thrown for invalid operations

---

## 🖥️ Main Application
The main application:
- Uses `DeliveryService` instead of concrete implementation
- Demonstrates full delivery lifecycle
- Shows polymorphic behavior for delivery charges
- Keeps logic clean and readable

---

## 🚀 Possible Enhancements
- Persist data using files or a database
- Add order cancellation feature
- Implement priority-based courier assignment
- Add unit tests
- Convert to a REST API using Spring Boot

---

## 🏁 Conclusion
This project provides hands-on experience with designing and implementing a real-world system using Java OOP concepts, arrays, collections, and exception handling.  
It builds a strong foundation for advanced backend development.

---
