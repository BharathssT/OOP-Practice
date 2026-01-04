package com.bharath.practice.oop1_library;

public abstract class LibraryMember {

    private String name;
    private int memberId;

    public LibraryMember(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
    }

    protected String getName(){
        return name;
    }

    protected int getMemberId(){
        return memberId;
    }

    public abstract void borrowBook();

    public void showDetails(){
        System.out.println("Name: "+ name + "," +" Member ID: "+ memberId);
    }
}
