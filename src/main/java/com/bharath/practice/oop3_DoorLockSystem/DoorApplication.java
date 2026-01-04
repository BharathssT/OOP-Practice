package com.bharath.practice.oop3_DoorLockSystem;

public class DoorApplication {

    public static void main(String[] args){

        Door door = new Door();

        System.out.println("Initial State");
        door.getDoorStatus();

        //Try opening while locked
        System.out.println("\nTrying to open the door while it is locked");
        System.out.println("Open Success: " + door.openDoor());
        door.getDoorStatus();

        //Unlock the door
        System.out.println("\nUnlocking the door");
        System.out.println("Unlock Success: " + door.unlockDoor());
        door.getDoorStatus();

        //Open the door
        System.out.println("\nOpening the door");
        System.out.println("Opening Success: " + door.openDoor());
        door.getDoorStatus();

        // Try locking while open
        System.out.println("\nTrying to lock the door (open):");
        System.out.println("Lock success: " + door.lockDoor());
        door.getDoorStatus();

        // Close the door
        System.out.println("\nClosing the door:");
        System.out.println("Close success: " + door.closeDoor());
        door.getDoorStatus();

        // Lock the door
        System.out.println("\nLocking the door:");
        System.out.println("Lock success: " + door.lockDoor());
        door.getDoorStatus();

    }
}
