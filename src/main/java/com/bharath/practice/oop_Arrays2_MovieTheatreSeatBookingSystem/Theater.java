package com.bharath.practice.oop_Arrays2_MovieTheatreSeatBookingSystem;

public class Theater {
    Seat[] seats;

    public Theater(int capacity){
        seats = new Seat[capacity];

        for(int i = 0; i < capacity; i++){
            seats[i] = new Seat(i + 1);
        }
    }

    public void bookTheSeat(int seatNumber, String customerName){
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number");
            return;
        }

        for(Seat seat : seats){
            if(seat.getSeatNumber() == seatNumber && !seat.isBooked()){
                seat.bookSeat(customerName);
                return;
            }
        }

        System.out.println("Seat already booked");

    }

    public void cancelTheSeat(int seatNumber){
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number");
            return;
        }

        for(Seat seat : seats){
            if(seat.getSeatNumber() == seatNumber && seat.isBooked()){
                seat.cancelBooking();
                return;
            }
        }

        System.out.println("Seat already available");

    }

    public void displaySeatingStatus(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatStatus());
        }
    }

    public int getAvailableSeatCount(){
        int count = 0;
        for(Seat seat : seats){
            if(!seat.isBooked()){
                count++;
            }
        }
        return count;
    }

}
