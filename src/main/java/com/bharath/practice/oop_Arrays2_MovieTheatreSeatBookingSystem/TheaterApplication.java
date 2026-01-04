package com.bharath.practice.oop_Arrays2_MovieTheatreSeatBookingSystem;

public class TheaterApplication {

    public static void main(String[] args){
        Theater theater = new Theater(20);

        System.out.println("Available Seats: ");
        theater.displaySeatingStatus();

        theater.bookTheSeat(1, "Bharath");
        theater.bookTheSeat(2, "Deepika");
        theater.bookTheSeat(5, "Sharath");
        theater.bookTheSeat(10, "Bhagath");
        theater.bookTheSeat(20, "Shekawath");


        System.out.println("\nAvailable Seats: ");
        theater.displaySeatingStatus();

        //Invalid seat number
        theater.bookTheSeat(30, "Monarch");

        //cancel the booking
        theater.cancelTheSeat(2);
        System.out.println("Available Seats: ");
        theater.displaySeatingStatus();


        System.out.println("\nTotal available seats: "+ theater.getAvailableSeatCount());
    }
}
