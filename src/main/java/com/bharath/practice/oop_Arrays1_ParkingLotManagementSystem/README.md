# 🚗 Parking Lot Management System (Array-based OOP Project)

## Overview

This project is a simple **Parking Lot Management System** built using **Java**, focused purely on **Object-Oriented Programming (OOP)** concepts and **arrays**.

The goal of this project is **learning and practice**, especially to strengthen understanding of:
- Object state
- Class responsibilities
- Arrays vs collections
- Real-world modeling using OOP

No frameworks, no collections, no lambdas — just clean core Java.

---

## Concepts Used

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Composition
- Arrays
- Control flow (if/else, loops)

---

## Project Structure

### Vehicle (Abstract Class)
Represents a generic vehicle.

- Holds common details like vehicle number and owner name
- Declares a method to identify vehicle type
- Extended by `Car` and `Bike`

Demonstrates abstraction, inheritance, and polymorphism.

---

### ParkingSlot
Represents a single physical parking slot.

- Holds one vehicle at a time
- Tracks whether the slot is occupied or empty
- Allows parking and removing a vehicle

Each slot manages **only its own state**.

---

### ParkingLot
Represents the entire parking area.

- Uses an array of `ParkingSlot`
- Initializes parking slots during construction
- Parks vehicles in the first available slot
- Removes vehicles by vehicle number
- Displays parking status
- Counts available slots

This class contains the **core business logic**.

---

### ParkingLotApplication
The main entry point of the application.

- Creates the parking lot
- Creates vehicles
- Parks and removes vehicles
- Displays parking status and available slots

Handles **application flow only**, not logic.

---

## Key Features

- Park vehicles in the first available slot
- Prevent parking when the lot is full
- Remove vehicles using vehicle number
- Display per-slot parking status
- Track available parking slots
- Supports multiple vehicle types (Car, Bike)

---

## Design Constraints

- Arrays only (no ArrayList, Map, etc.)
- No streams or lambda expressions
- No user input (demo-based execution)
- Clean separation of responsibilities
- Focus on clarity over complexity

---

## Learning Outcome

After completing this project, you will understand:
- How object state changes over time
- How arrays are managed manually
- How responsibilities are divided across classes
- How OOP principles apply to real-world problems
- Why clean design matters before moving to frameworks

---

## How to Run

1. Compile all Java classes
2. Run `ParkingLotApplication`
3. Observe console output for:
    - Vehicle parking
    - Slot allocation
    - Vehicle removal
    - Available slot count

---

## Conclusion

This project is a **foundational OOP exercise** intended to build confidence before moving to:
- Collections
- Lambdas
- Streams
- Spring Framework

Simple, clean, and effective.
