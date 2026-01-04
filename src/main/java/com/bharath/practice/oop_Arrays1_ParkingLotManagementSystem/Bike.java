package com.bharath.practice.oop_Arrays1_ParkingLotManagementSystem;

public class Bike extends Vehicle{

    public Bike(String vehicleName, String ownerName){
        super(vehicleName,ownerName);
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}
