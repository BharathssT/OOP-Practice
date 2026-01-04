# 🔒 Door Lock System (Boolean-focused OOP Project)

## Overview

This is a small Java console-based project created to practice **boolean logic in Object-Oriented Programming (OOP)**.

The project simulates a simple **Door Lock System** where a door can be:
- Locked / Unlocked
- Opened / Closed

All behavior is controlled using boolean state variables.

---

## Purpose

This project is designed to:
- Strengthen understanding of boolean values (`true` / `false`)
- Learn how object **state** affects behavior
- Practice writing clear conditional logic
- Avoid unnecessary complexity

---

## Concepts Used

- Encapsulation
- Object state
- Boolean logic
- Conditional statements
- Method-driven state changes

---

## Class Design

### Door
Represents a door with two states:
- `locked`
- `open`

The class provides methods to:
- Lock the door
- Unlock the door
- Open the door
- Close the door
- Display door status in a human-readable format

The constructor initializes the door as **closed and locked**.

---

### DoorApplication
Acts as the entry point of the program.

It:
- Creates a `Door` object
- Calls various methods in valid and invalid states
- Prints results to observe boolean state transitions

---

## Key Learning Outcome

By completing this project, you will understand:
- How booleans represent object state
- How to block invalid actions using conditions
- How to safely change state through methods
- How to present boolean values meaningfully to users

---

## How to Run

1. Compile all classes
2. Run `DoorApplication`
3. Observe console output showing door state changes

---

## Conclusion

This is a **minimal but powerful OOP exercise** focused purely on boolean logic.  
It builds a strong foundation before moving to larger systems involving collections, concurrency, or frameworks.

Simple. Clear. Effective.
