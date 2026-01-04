package com.bharath.practice.oop_collection3_smarthome;

public class DeviceManagerMain {

    public static void main(String[] args){

        DeviceManager deviceManager = new DeviceManager();

        Light liveLight = new Light("L1", "Ceiling Light", "Living Room");
        liveLight.setBrightness(75);
        liveLight.setColor("Warm white");

        Thermostat hallThermo = new Thermostat("T1", "Hall Thermostat", "Hall");

        Camera frontCam = new Camera("C1", "Front Door Cam", "Front Door");

        DoorLock mainDoor = new DoorLock("D1", "Main Door Lock", "Front Door");

        deviceManager.addDevice(liveLight);
        deviceManager.addDevice(hallThermo);
        deviceManager.addDevice(frontCam);
        deviceManager.addDevice(mainDoor);

        System.out.println("ALl the registered devices:");
        deviceManager.showAllDevices();

        System.out.println("\n Controlling Devices via Device Manager");
        deviceManager.controlDevice("L1", true);
        deviceManager.controlDevice("T1", true);
        deviceManager.controlDevice("C1", true);
        deviceManager.controlDevice("D1", true);

        System.out.println("\n Finding device by ID(L1) and show status");
        Device found = deviceManager.findDeviceById("L1");
        if(found != null) {
            found.status();
        }

        System.out.println("\n Turning off Light and Camera");
        deviceManager.controlDevice("L1", false);
        deviceManager.controlDevice("C1", false);

        System.out.println("\n Final Statuses");
        deviceManager.showAllDevices();


    }
}
