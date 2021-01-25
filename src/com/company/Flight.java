package com.company;

public class Flight {

    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    String getFlightDetails(){
       return "FlightNumber:" + flightNumber + " Airline:" + airline+ " Capacity" + capacity + " BookedSeats" + bookedSeats;
    }
    boolean checkAvailability(){
        return bookedSeats < capacity;
    }
    void incrementBookingCounter(){
        bookedSeats = bookedSeats + 1;
    }
}
