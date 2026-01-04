package com.bharath.practice.oop2_petcare;

public class Owner {

    private String name;
    private int phNumber;

    public Owner(String name, int phNumber){
        this.name = name;
        this.phNumber = phNumber;
    }

    public String getName(){return name;}
    public int getPhNumber(){return phNumber;}

    public void showOwnerInfo(){
        System.out.println("The owner name is: "+getName()+"(PH:"+getPhNumber()+")");
    }

}
