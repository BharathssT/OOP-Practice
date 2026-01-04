# 🎟️ Movie Theatre Seat Booking System (Array-based OOP Project)

## Overview

This project is a **Java console-based Movie Theatre Seat Booking System** built to practice **Object-Oriented Programming (OOP)** concepts using **arrays**.

It simulates a real-world movie theater where seats can be:
- Booked
- Cancelled
- Viewed
- Counted for availability

The focus of this project is **clear logic, boolean state management, and array handling**, not advanced frameworks or collections.

---

## Purpose

This project was created to:
- Strengthen understanding of **arrays**
- Practice **boolean-driven state changes**
- Improve logical thinking with loops and conditions
- Apply OOP principles in a realistic scenario
- Avoid over-engineering and keep design clean

---

## Concepts Used

- Object-Oriented Programming (OOP)
- Encapsulation
- Arrays
- Boolean logic
- Control flow (`if`, `for`, `return`)
- Separation of responsibilities

---

## Project Structure

### Seat
Represents a single seat in the theater.

**Responsibilities:**
- Stores seat number
- Tracks booking state using a boolean
- Stores customer name
- Allows booking and cancellation
- Provides human-readable seat status

Each `Seat` manages **only its own state**.

---

### Theater
Represents the entire movie theater.

**Responsibilities:**
- Manages an array of `Seat` objects
- Initializes seats during construction
- Books a specific seat by seat number
- Cancels booking for a specific seat
- Displays seating status
- Counts available seats

This class contains the **core business logic**.

---

### TheaterApplication
The entry point of the application.

**Responsibilities:**
- Creates a `Theater`
- Books seats
- Tries invalid operations
- Cancels bookings
- Displays seating status
- Prints available seat count

This class controls **program flow only**, not logic.

---

## Key Features

- Fixed number of seats using arrays
- Seat booking with customer name
- Booking validation (already booked / invalid seat)
- Cancellation validation
- Clear seating status display
- Accurate available seat count

---

## Design Constraints

- ❌ No collections (`ArrayList`, `Map`, etc.)
- ❌ No streams or lambdas
- ❌ No exceptions
- ❌ No user input
- ✅ Arrays only
- ✅ Boolean-based state management
- ✅ Clean separation of responsibilities

---

## Learning Outcomes

By completing this project, you will understand:
- How arrays are initialized and accessed
- Difference between array index and real-world numbering
- How booleans represent object state
- How `return` controls program flow
- How to design small, clean OOP systems

---

## How to Run

1. Compile all Java classes
2. Run `TheaterApplication`
3. Observe console output showing:
    - Initial seating status
    - Successful bookings
    - Invalid booking attempts
    - Booking cancellation
    - Final available seat count

---

## Conclusion

This project is a **step up from basic array exercises**, designed to bridge the gap between theory and real-world OOP usage.

It builds a strong foundation before moving on to:
- Collections
- Streams
- Lambdas
- Frameworks like Spring

Simple, practical, and effective.
