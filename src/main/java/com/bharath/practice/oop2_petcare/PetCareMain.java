package com.bharath.practice.oop2_petcare;

public class PetCareMain {

    public static void main(String[] args){

        Owner bharath = new Owner("Bharath Thota", 123456789);
        Owner abdul = new Owner("Abdul Rehman", 31256789);

        AdoptionCenter ac = new AdoptionCenter();

        Pet simba = ac.adoptPet("Simba", "Dog");
        Pet bella = ac.adoptPet("Bella", "Cat");

        OwnerService service = new OwnerService();
        service.assignOwnerToPet(bharath, simba);

        simba.getInfo();
        bella.getInfo();


    }
}
