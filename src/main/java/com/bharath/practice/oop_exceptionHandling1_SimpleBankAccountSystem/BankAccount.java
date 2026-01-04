package com.bharath.practice.oop_exceptionHandling1_SimpleBankAccountSystem;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }

    public String getAccountNumber(){ return accountNumber;}
    public String getAccountHolderName(){ return accountHolderName;}
    public double getBalance(){ return balance;}

    public void deposit(double amount){

        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        } else {
            balance += amount;
            System.out.println("The amount "+amount+" has been deposited. The updated balance is "+balance);
        }

    }

    public void withdraw(double amount){

        if(amount <= 0 || amount > balance){
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero and less than or equal to balance");
        } else {
            balance -= amount;
            System.out.println("You have withdrawn an amount of "+amount+" The updated balance is "+balance);
        }

    }




}
