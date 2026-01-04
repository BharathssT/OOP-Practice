package com.bharath.practice.oop_Arrays1_ParkingLotManagementSystem;

public class ParkingSlot {
    //Represents one physical parking slot
    private int slotNumber;
    private boolean occupied;
    private Vehicle vehicle;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (occupied) {
            return false;
        }

        this.vehicle = vehicle;
        this.occupied = true;
        return true;
    }

    public boolean removeVehicle() {
        if (!occupied) {
            return false;
        }

        this.vehicle = null;
        this.occupied = false;
        return true;
    }

}
