package com.bharath.practice.oop_collection1_petregistry;

public class Pet {

    private String name;
    private String type;

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){return name;}
    public String getType(){return type;}

    public void getInfo(){
        System.out.println("Pet name: " + getName() + ", Pet type: " + getType());
    }
}
