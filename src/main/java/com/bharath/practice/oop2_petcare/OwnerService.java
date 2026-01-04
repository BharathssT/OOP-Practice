package com.bharath.practice.oop2_petcare;

public class OwnerService {

    public void assignOwnerToPet(Owner owner, Pet pet){
        System.out.println("Assigning owner "+owner.getName()+" to pet "+pet.getName());
        pet.assignOwner(owner);
    }
}
