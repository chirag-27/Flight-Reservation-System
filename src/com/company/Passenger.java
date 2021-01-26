package com.company;

import java.util.Scanner;

public class Passenger {
    private static int idCounter = 0;

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    //nested contact class
    private static class Contact {
        private String name;
        private String phone;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }


    }
    private Contact contact;

    //nested address class
    private static class Address {
        //attributes
        private String street;
        private String city;
        private String state;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        //constructor
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
        //methods


    }
    private Address address;
        //
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

        public Passenger(int idCounter,String addressStreet, String addressCity,
                         String addressState, String contactName, String contactPhone,
                         String contactEmail) {
            this.id = Passenger.idCounter;
            this.address = new Address(addressStreet, addressCity, addressState);
            this.contact = new Contact(contactName, contactPhone, contactEmail);
            Passenger.idCounter = this.id + 1;
        }

        public int getPassengerCount(){
            return Passenger.idCounter;
        }

    String getContactDetails() {
        return "name:" + contact.name + ", phone:" + contact.phone + ", email:" + contact.email;
    }

    void updateContactDetails() {
        System.out.println("Update contact details.");
        System.out.println("1.name 2.phone 3.email 4.no updates");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a) {
            case 1:
                contact.name = scan.next();
                System.out.println("Updated contact details are:" + getContactDetails());
                break;
            case 2:
                contact.phone = scan.next();
                System.out.println("Updated contact details are:" + getContactDetails());
                break;
            case 3:
                contact.email = scan.next();
                System.out.println("Updated contact details are:" + getContactDetails());
                break;
            case 4:
                System.out.println("Thank you!");
                break;
        }
    }

    String getAddressDetails(){
        return address.street +"," + address.city + ", " + address.state;
    }

    void updateAddressDetails(){
        System.out.println("Update Address details.");
        System.out.println("1.street 2.city 3.State 4.no updates");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 1:
                address.street = scan.next();
                System.out.println("Updated Address details are:" + getAddressDetails());
                break;
            case 2:
                address.city = scan.next();
                System.out.println("Updated Address details are:" + getAddressDetails());
                break;
            case 3:
                address.state = scan.next();
                System.out.println("Updated Address details are:" + getAddressDetails());
                break;
            case 4:
                System.out.println("Thank you!");
                break;
        }

    }
    }

