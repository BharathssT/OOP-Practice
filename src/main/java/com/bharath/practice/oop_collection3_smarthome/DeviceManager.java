package com.bharath.practice.oop_collection3_smarthome;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {

    private final List<Device> deviceList = new ArrayList<>();

    public void addDevice(Device device){
        deviceList.add(device);
    }



    public void removeDevice(String id){
        for(int i = 0; i < deviceList.size(); i++){
            if(id.equals(deviceList.get(i).getId())){
                deviceList.remove(i);
                break;
            }
        }
    }

    public Device findDeviceById(String id){
        for(Device device : deviceList){
            if(id.equals(device.getId())){
                return device;
            }
        }
        return null;
    }

    public List<Device> filterByLocation(String location){
        List<Device> list = new ArrayList<>();

        for(Device device : deviceList){
            if(device.getLocation().equalsIgnoreCase(location)){
                list.add(device);
            }
        }

        return list;
    }

    public void showAllDevices(){
        for(Device device : deviceList){
            device.showDetails();
        }
    }

    public void controlDevice(String id, boolean turn){
        for(Device device : deviceList){
            if(device.getId().equals(id)){
                if(turn){
                    ((Controllable) device).turnOn();
                } else {
                    ((Controllable) device).turnOff();
                }
                return;
            }
        }
        System.out.println("Device not found with id: " + id);
    }
}
