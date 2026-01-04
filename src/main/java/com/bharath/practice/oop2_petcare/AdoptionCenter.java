package com.bharath.practice.oop2_petcare;

public class AdoptionCenter {

    public Pet adoptPet(String name, String type){
        return new Pet(name, type);
    }
}
