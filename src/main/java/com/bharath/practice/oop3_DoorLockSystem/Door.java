package com.bharath.practice.oop3_DoorLockSystem;

public class Door {
    private boolean locked;
    private boolean open;

    public Door(){
        //The door starts closed and locked
        this.locked = true;
        this.open = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean lockDoor(){
        if(locked || open){
            return false;
        }
        locked = true;
        return true;
    }

    public boolean unlockDoor(){
        if(!locked){
            return false;
        }

        locked = false;
        return true;
    }

    public boolean openDoor(){
        if (locked || open){
            return false;
        }
        open = true;
        return  true;
    }

    public boolean closeDoor(){
        if(!open){
            return false;
        }
        open = false;
        return true;
    }

    public void getDoorStatus(){
        String lockStatus = locked ? "Locked" : "Unlocked";
        String openStatus = open ? "Opened" : "Closed";
        System.out.println("The door is " + lockStatus + " and " + openStatus);
    }

}
