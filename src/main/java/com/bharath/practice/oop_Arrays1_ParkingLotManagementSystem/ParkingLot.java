package com.bharath.practice.oop_Arrays1_ParkingLotManagementSystem;

public class ParkingLot {

    ParkingSlot[] slots;

    public ParkingLot(int capacity){

        slots = new ParkingSlot[capacity];

        for(int i = 0; i < capacity; i++){
            slots[i] = new ParkingSlot(i + 1);
        }

    }

    public void parkVehicle(Vehicle vehicle){
        for(ParkingSlot slot : slots){
            if(!slot.isOccupied()){
                slot.parkVehicle(vehicle);
                return;
            }
        }
        System.out.println("Parking lot is full");
    }

    public void removeVehicle(String vehicleNumber){

        for(ParkingSlot slot : slots){
            if(slot.isOccupied()){
                if(slot.getVehicle().getVehicleNumber().equals(vehicleNumber)){
                    slot.removeVehicle();
                    return;
                }
            }
        }
        System.out.println("Vehicle not found");
    }

    public void displayParkingStatus(){
        for(ParkingSlot slot : slots){
            System.out.println(slot.getSlotNumber());
            if(slot.isOccupied()){
                System.out.println("Vehicle details: " + slot.getVehicle());
            } else {
                System.out.println("Slot is empty");
            }
        }
    }

    public int getAvailableSlotCount(){
        int count = 0;
        for(ParkingSlot slot : slots){
            if(!slot.isOccupied()){
                count++;
            }
        }
        return count;
    }
}
