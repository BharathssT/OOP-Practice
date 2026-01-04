package com.bharath.practice.oop_Arrays1_ParkingLotManagementSystem;

public abstract class Vehicle {
    //Represents a generic vehicle

    private String vehicleNumber;
    private String ownerName;

    public Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract String getVehicleType();
}
