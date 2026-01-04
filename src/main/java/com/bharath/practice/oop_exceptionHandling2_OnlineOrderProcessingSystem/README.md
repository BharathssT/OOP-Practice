# OOP + Exception Handling – Online Order Processing System

This project is a Java practice application designed to strengthen Object-Oriented Programming concepts along with exception handling using real-world order processing logic.

---

## 📌 Project Overview

The system simulates an online order workflow where orders can be:
- Created
- Processed
- Cancelled

Orders can exist in different states, and invalid state transitions are prevented using exceptions.

---

## 🧱 Core Concepts Practiced

### Object-Oriented Programming
- Encapsulation (private fields with getters)
- Inheritance (`OnlineOrder`, `StorePickupOrder` extend `Order`)
- Polymorphism (overriding `getOrderDetails()`)

### Exception Handling
- `IllegalStateException` to prevent invalid order state transitions
- Try–catch blocks in the main application to handle failures gracefully

---

## 🏗️ Class Structure

### `Order`
Base class representing a generic order.

**Fields**
- `orderId`
- `customerName`
- `amount`
- `status` (`Created`, `Processed`, `Cancelled`)

**Key Methods**
- `processOrder()`  
  Processes the order only if the current state is `Created`
- `cancelOrder()`  
  Cancels the order only if the current state is `Created`
- `getOrderDetails()`  
  Displays order information

Invalid operations throw `IllegalStateException`.

---

### `OnlineOrder`
Extends `Order`

**Additional Field**
- `deliveryAddress`

Overrides `getOrderDetails()` to include delivery address.

---

### `StorePickupOrder`
Extends `Order`

**Additional Field**
- `storeLocation`

Overrides `getOrderDetails()` to include pickup location.

---

### `OrderApplication`
Main class used to:
- Create orders with different initial states
- Call `processOrder()` and `cancelOrder()`
- Demonstrate exception handling using `try-catch`

---

## ⚠️ Exception Handling Logic

- An order can be **processed or cancelled only when its status is `Created`**
- Attempting to process/cancel an order in any other state throws `IllegalStateException`
- Once an exception occurs, execution jumps to the `catch` block

This mirrors real-world business rule enforcement.

---

## 🎯 Learning Outcome

By completing this project, you practiced:
- Enforcing business rules using exceptions
- Modeling real-world workflows using OOP
- Understanding how program flow changes when exceptions occur
- Designing clean class hierarchies with shared behavior

---

## 🔜 Possible Enhancements
- Replace `String status` with an `enum`
- Add custom exception classes
- Process multiple orders using collections
- Log errors instead of printing to console

---
