package com.bharath.practice.oop_Arrays1_ParkingLotManagementSystem;

public class Car extends Vehicle {
    //Represent a car

    public Car(String vehicleNumber, String ownerName){
        super(vehicleNumber,ownerName);
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
