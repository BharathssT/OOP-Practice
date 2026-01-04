package com.bharath.practice.oop_Arrays1_ParkingLotManagementSystem;

public class ParkingLotApplication {

    public static void main(String[] args) {

        // Create parking lot with 5 slots
        ParkingLot parkingLot = new ParkingLot(5);

        // Create vehicles
        Vehicle car1 = new Car("KA-01-1234", "Bharath");
        Vehicle car2 = new Car("KA-02-5678", "Arjun");
        Vehicle bike1 = new Bike("KA-03-9999", "Rahul");

        // Park vehicles
        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(bike1);

        // Display parking status
        System.out.println("\n--- Parking Status ---");
        parkingLot.displayParkingStatus();

        // Remove a vehicle
        System.out.println("\n--- Removing Vehicle KA-02-5678 ---");
        parkingLot.removeVehicle("KA-02-5678");

        // Display parking status again
        System.out.println("\n--- Parking Status After Removal ---");
        parkingLot.displayParkingStatus();

        // Show available slots
        System.out.println("\nAvailable Slots: " + parkingLot.getAvailableSlotCount());

    }

}
