package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Address address = new Address("exampleRoad", "exampleCity","exampleState");
        Contact contact = new Contact("Rahul","1234567890", "example@gmail.com" );
        Flight flight = new Flight( "25","Air india", 200, 150);
        Passenger passenger = new Passenger(12, address, contact);
        Ticket ticket = new Ticket( "121", "mum","del", flight, "27/01/2020,22.30", "27/01/2021,02.30",
                passenger, "A23", 5000.0F, false );
        TouristTicket touristTicket = new TouristTicket("this road, that city, that state",
                new String[]{"sunrise point", "sunset point", "fort", "Taj Mahal", "lake"});
        RegularTicket regularTicket = new RegularTicket("Food, Drinks");


        System.out.println("Passenger id:" + passenger.id);
        System.out.println("Passenger Address:" + address.getAddressDetails());
        System.out.println("Passenger Contact Details: "+ contact.getContactDetails());
        contact.updateContactDetails();

        address.updateAddressDetails();
        System.out.println("Which kind of ticket would you like to book:");
        System.out.println("1.Regular Ticket 2.Tourist Ticket");
        int chooseType = input.nextInt();
        switch (chooseType){
            case 1:
                System.out.println("Your Special Services are:" + regularTicket.getSpecialServices());
                System.out.println("Would you like to update Special Services: 1.Update");
                int choseUpdate = input.nextInt();
                switch (choseUpdate){
                    case 1:
                        regularTicket.updateSpecialServices();
                        break;
                    default:
                        System.out.println("Thank You!");
                        break;
                }
            case 2:
                System.out.println("Your hotel Address is: " + touristTicket.getHotelAddress());
                System.out.println("Your Selected tourist locations are: ");
                System.out.println(Arrays.toString(touristTicket.getTouristLocation()));
                System.out.println("Would you like to remove a tourist location: 1.Yes 2.No");
                int remove = input.nextInt();
                switch(remove){
                    case 1:
                        String locationToRemove = input.next();
                        touristTicket.removeTouristLocation(locationToRemove);
                        System.out.println("Your Selected tourist locations are: " + Arrays.toString(touristTicket.getTouristLocation()));
                        break;
                    case 2:
                        System.out.println("Thank you!");
                        break;
                }

                System.out.println("Would you like to add a tourist location: 1.Yes 2.No");
                int add = input.nextInt();
                switch(add){
                    case 1:
                        String locationToAdd = input.next();
                        touristTicket.addTouristLocation(locationToAdd);
                        System.out.println("Your Selected tourist locations are: " + Arrays.toString(touristTicket.getTouristLocation()));
                        break;
                    case 2:
                        System.out.println("Thank you!");
                        break;
                }
        }

        System.out.println("Ticket Details: ");
        System.out.println(ticket.getTicketDetails());
        System.out.println("Would you like to cancel ticket:");
        System.out.println("1.yes 2.No");
        int cancelTicket = input.nextInt();
        if(cancelTicket==1) {
            ticket.cancel();
        }
        System.out.println("Check Status:" + ticket.checkStatus());
        System.out.println("Flight duration: " + ticket.getFlightDuration());

        System.out.println("Flight Details:" );
        System.out.println(flight.getFlightDetails());
        System.out.println("Available:" + flight.checkAvailability());

        flight.incrementBookingCounter();
        System.out.println("Updated flight Details:" + flight.getFlightDetails());
    }
}
