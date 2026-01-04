package com.bharath.practice.oop_collection1_petregistry;

public class PetRegistryMain {

    public static void main(String[] args){

        PetRegistry registry = new PetRegistry();

        Pet simba = new Pet("Simba", "Dog");
        Pet bella = new Pet("Bella", "Cat");
        Pet ragnar = new Pet("Ragnar", "Dog");
        Pet silvester = new Pet("Silvester", "Cat");
        Pet tweety = new Pet("Tweety", "Bird");
        Pet bunny = new Pet("Bunny", "Rabbit");

        registry.addPet(simba);
        registry.addPet(bella);
        registry.addPet(ragnar);
        registry.addPet(silvester);
        registry.addPet(tweety);
        registry.addPet(bunny);

        System.out.println("Showing all the pets:");
        registry.showAllPets();

        System.out.println("\nFind pet by name:");
        Pet found = registry.findPetByName("Ragnar");
        if(found != null) found.getInfo();

        System.out.println("\nFilter by type (Cat):");
        registry.filterByType("Cat");

        System.out.println("\nRemoving Tweety...");
        registry.removePet("Tweety");

        System.out.println("\nPets after removal:");
        registry.showAllPets();

    }

}
