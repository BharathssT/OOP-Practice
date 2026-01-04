# Pet Care System – OOP Practice (Java)

This project is a small Java practice exercise focused on understanding
object interactions in Object-Oriented Programming.  
It demonstrates:

- Passing custom objects as method parameters
- Composition (`Pet` *has an* `Owner`)
- Basic service-style classes (`OwnerService`)
- Simple object creation logic (`AdoptionCenter`)
- Method calls between multiple classes

The goal is to get comfortable with method signatures like:
`checkPet(Pet pet)` and `assignOwnerToPet(Owner owner, Pet pet)`.

---

## 🧱 Class Overview

### **Pet**
Represents an animal in the pet care system.

- Fields: `name`, `type`, `owner`
- Methods:
    - `getInfo()` → prints pet + owner info
    - `assignOwner(Owner owner)` → sets the pet’s owner
    - getters for name & type

### **Owner**
Represents a person who can own one or more pets.

- Fields: `name`, `phNumber`
- Methods:
    - Getters
    - `showOwnerInfo()`

### **AdoptionCenter**
Responsible for creating new `Pet` objects.

- Method:
    - `adoptPet(String name, String type)` → returns a new `Pet` instance

### **OwnerService**
Assigns an owner to a pet.

- Method:
    - `assignOwnerToPet(Owner owner, Pet pet)`
        - prints assignment message
        - calls `pet.assignOwner(owner)`

### **Vet**
Provides a health check for a pet.

- Method:
    - `checkPet(Pet pet)` → prints which pet is being checked

### **Trainer**
Provides training to a pet.

- Method:
    - `trainPet(Pet pet)`

### **PetCareMain**
Entry point of the project.  
Creates owners, pets, assigns ownership, and prints info.

---

## 🎯 Learning Objectives

- Understand how objects interact across classes
- Practise method parameters using custom types
- Get comfortable with `new` object creation
- Learn composition (object inside another object)
- Understand when to call a method directly (`getName()`) vs on a reference (`pet.getName()`)

---

## ▶️ How to Run

1. Open `PetCareMain.java`
2. Run the `main()` method
3. Observe:
    - Pets being adopted
    - Owners being assigned
    - Trainer/Vet interacting with pets
    - Correct printing of pet + owner info

---

## 🔜 Possible Extensions (Optional)

- Add `Dog` and `Cat` subclasses of `Pet`
- Add a grooming service
- Add a `hasOwner()` method
- Prevent reassigning an owner
- Add an adoption history log (when you learn collections)

---
