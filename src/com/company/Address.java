package com.company;
import java.util.Scanner;
public class Address {
    Scanner scan = new Scanner(System.in);
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
    String getAddressDetails(){
        return street +"," + city + ", " + state;
    }
    void updateAddressDetails(){
        System.out.println("Update Address details.");
        System.out.println("1.street 2.city 3.State 4.no updates");
        int a = scan.nextInt();
        switch(a){
            case 1:
                this.street = scan.next();
                System.out.println("Updated Address details are:" + getAddressDetails());
                break;
            case 2:
                this.city = scan.next();
                System.out.println("Updated Address details are:" + getAddressDetails());
                break;
            case 3:
                this.state = scan.next();
                System.out.println("Updated Address details are:" + getAddressDetails());
                break;
            case 4:
                System.out.println("Thank you!");
                break;
        }

    }
}
