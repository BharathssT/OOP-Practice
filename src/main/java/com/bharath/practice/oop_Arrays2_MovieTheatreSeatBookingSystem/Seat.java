package com.bharath.practice.oop_Arrays2_MovieTheatreSeatBookingSystem;

public class Seat {
    private int seatNumber;
    private boolean booked;
    private String customerName;

    public Seat(int seatNumber){
        this.seatNumber = seatNumber;
        this.booked = false;
        this.customerName = null;
    }

    public int getSeatNumber(){return  seatNumber;}
    public boolean isBooked(){return booked;}
    public String getCustomerName(){return customerName;}

    public boolean bookSeat(String customerName){
        if(booked){
            return false;
        }

        this.customerName = customerName;
        booked = true;
        return true;
    }

    public boolean cancelBooking(){
        if(!booked){
            return false;
        }

        this.customerName = null;
        booked = false;
        return true;
    }

    public String getSeatStatus(){
        if(booked){
            return "Seat: " + seatNumber + " Booked by: " + customerName;
        }

        return  "Seat: " + seatNumber +" Available";
    }

}
