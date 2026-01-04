package com.bharath.practice.oop_collection1_petregistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PetRegistry {

    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void showAllPets(){
        for(Pet pet : pets){
            pet.getInfo();
        }
    }

    public Pet findPetByName(String name){
        for(Pet pet : pets){
            if(name.equals(pet.getName())){
                return pet;
            }
        }
        return null;
    }

    public void filterByType(String type){
        for(Pet pet : pets){
            if(type.equals(pet.getType())){
                pet.getInfo();
            }
        }
    }

    public void removePet(String name){
        for(int i = 0; i < pets.size(); i++){
            if(name.equals(pets.get(i).getName())){
                pets.remove(i);
                break;
            }
        }
    }

}
