package com.bharath.practice.oop_exceptionHandling1_SimpleBankAccountSystem;

public class BankAccountApplication {

    public static void main(String[] args){

        BankAccount bankAccount1 = new BankAccount("12345", "MeghaShyam Thota", 5000.00);

        try{
            bankAccount1.deposit(5000.00);
            bankAccount1.withdraw(1000.00);
            System.out.println("\nThe final updated balance is: "+bankAccount1.getBalance());
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught: " +e.getMessage());
        }

    }

}
