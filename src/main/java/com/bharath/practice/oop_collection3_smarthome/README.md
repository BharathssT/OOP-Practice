# Smart Home Device Manager (OOP + Collections)

A Java project designed to practice Object-Oriented Programming concepts combined with Collections.  
The system manages different smart home devices such as Lights, Thermostats, Cameras, and Door Locks.

---

## 🎯 Project Goals
- Strengthen OOP fundamentals:
    - Abstraction
    - Inheritance
    - Polymorphism
    - Encapsulation
    - Interfaces
- Practice working with collections (`List<Device>`)
- Handle dynamic device control via shared interface `Controllable`

---

## 🧱 Core Components

### **1. Device (Abstract Class)**
Base class for all devices.  
Fields:
- `id`
- `name`
- `location`
- `online` (boolean)

Methods:
- `abstract void status()`
- `void setStatus(boolean)`
- `boolean isOnline()`
- `void showDetails()`

---

### **2. Controllable (Interface)**
Defines control actions that devices can perform:
- `turnOn()`
- `turnOff()`
- `getStatus()`

Implemented by all device types.

---

## 🏠 Device Types (Subclasses)

### **Light**
- Extra fields: `brightness`, `color`
- Overrides `status()`
- Implements `turnOn()` / `turnOff()`

### **Thermostat**
- Extra fields: `currentTemp`, `targetTemp`
- Custom temperature reporting
- Implements `Controllable`

### **Camera**
- Uses `setStatus()` to start/stop recording
- Reports "Recording" / "Idle"

### **DoorLock**
- Uses `lock()` / `unlock()` internally
- Reports "Locked" / "Unlocked"

---

## 📦 DeviceManager (Uses Collections)
Responsibilities:
- Store all devices in `List<Device>`
- Add/remove devices
- Find devices by ID
- Filter devices by location
- Control any device through the `Controllable` interface
- Display all registered devices

---

## ▶️ Main Application Flow
- Create multiple devices (Light, Thermostat, Camera, DoorLock)
- Register them into `DeviceManager`
- Control devices (turn on/off)
- Search devices by ID
- Display statuses of all devices

---

## 📚 Concepts Practiced
- Abstract classes
- Interfaces
- Polymorphism through `Controllable`
- Overriding methods
- Using collections to manage objects
- Downcasting only when needed
- Ternary operator (`condition ? value1 : value2`)

---

## 🚀 Future Enhancements
- Add `Schedulable` interface
- Use Java Streams
- Add exception handling
- Persist device settings using files or JSON

---

