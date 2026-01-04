# Simple Bank Account System (OOP + Exception Handling)

This project is a small Java application built to practice **Object-Oriented Programming (OOP)** concepts along with **exception handling**.

## 🎯 Purpose
The goal of this project is to understand:
- Encapsulation using private fields and public methods
- Validating business rules inside methods
- Throwing and handling exceptions using `IllegalArgumentException`
- Using `try-catch` blocks in the main application

## 🏦 Project Overview
The system simulates a basic bank account with operations such as:
- Depositing money
- Withdrawing money
- Checking balance

Invalid operations throw exceptions which are handled gracefully in the main application.

## 🧱 Classes

### BankAccount
Represents a bank account.

**Fields:**
- `accountNumber`
- `accountHolderName`
- `balance`

**Methods:**
- `deposit(double amount)`
    - Throws exception if amount ≤ 0
- `withdraw(double amount)`
    - Throws exception if amount ≤ 0 or greater than balance
- Getter methods for account details

### BankAccountApplication
Main class used to test different scenarios:
- Depositing a negative amount
- Withdrawing more than available balance
- Withdrawing zero
- Performing valid transactions and printing final balance

Exceptions are handled using `try-catch`.

## ⚠️ Exception Handling
- Uses **IllegalArgumentException** for invalid input
- Exceptions are thrown inside business logic
- Exceptions are caught and handled in the main method

## 📚 Concepts Practiced
- Encapsulation
- Method validation
- `throw` keyword
- `try-catch` blocks
- Runtime exceptions
- Clean separation of logic and execution

## 🔜 Next Improvements
- Custom exception classes
- Transaction history using collections
- User input handling
- Logging instead of `System.out.println`

---

This project is intentionally simple to build confidence before moving to more complex systems.
