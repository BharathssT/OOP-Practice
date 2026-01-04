# OOP + Collections Practice – Pet Registry

This is a small Java project that combines **Object-Oriented Programming (OOP)** with the **Collections Framework**.  
It models a simple pet registry where pets can be added, searched, filtered, listed, and removed.

---

## 🐾 Project Overview

The system keeps track of pets in a registry.  
Each pet has basic information, and the registry provides operations to:

- Add new pets
- Show all registered pets
- Find a pet by name
- Filter pets by type (e.g., all cats, all dogs)
- Remove a pet by name

This project is focused on practicing:

- Classes and objects
- Encapsulation
- Basic domain modeling
- Using `List` (specifically `ArrayList`) to manage objects
- Iterating over collections with loops

---

## 🧱 Class Overview

### `Pet`
Represents a single pet in the system.

**Fields:**
- `name` – name of the pet
- `type` – type of the pet (e.g., Dog, Cat, Bird)

**Methods:**
- `getName()` – returns the pet’s name
- `getType()` – returns the pet’s type
- `getInfo()` – prints a simple description of the pet

---

### `PetRegistry`
Manages a collection of pets using a `List<Pet>`.

**Fields:**
- `pets` – `List<Pet>` that stores all registered pets

**Core Methods:**

- `addPet(Pet pet)`  
  Adds a pet to the registry.

- `showAllPets()`  
  Iterates over `pets` and prints info for each pet.

- `findPetByName(String name)`  
  Searches the list for a pet with the given name and returns the matching `Pet`, or `null` if not found.

- `filterByType(String type)`  
  Prints all pets that match the given type (e.g. all `"Cat"` pets).

- `removePet(String name)`  
  Finds and removes the first pet with the given name from the list.

---

### `PetRegistryMain`
Entry point of the application.

**Responsibilities:**
- Creates a `PetRegistry` instance
- Creates several `Pet` objects
- Adds pets to the registry
- Calls methods to:
    - show all pets
    - find a pet by name
    - filter by type
    - remove a pet and show the updated list

---

## 🎯 Learning Goals

This project is designed to strengthen:

- How to **model real-world entities** as Java classes
- How to work with **collections of objects** using `List<Pet>`
- How to **iterate** over lists using `for` loops
- How to implement simple **search and filter logic**
- How to separate **responsibilities** between:
    - a domain class (`Pet`)
    - and a service/manager class (`PetRegistry`)

---

## 🔜 Possible Extensions

Some ideas to extend this project later:

- Support updating a pet’s type
- Prevent adding duplicate pets (same name + type)
- Use `Map<String, Pet>` keyed by name instead of `List<Pet>`
- Add an ID field to each pet
- Add a `removeAllByType(String type)` method
- Replace loops with Java Stream API (in a future Streams practice project)

---

This is one step in a series of practice projects combining **OOP + Collections**, as preparation for building real-world Spring Boot applications.
