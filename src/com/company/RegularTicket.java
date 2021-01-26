package com.company;

import java.util.Scanner;
//extended RegularTicket to ticket
public class RegularTicket extends Ticket{
    Scanner scan = new Scanner(System.in);
    private String specialServices;

    public RegularTicket(String specialServices, String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo,float price, boolean cancelled) {
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled);
        this.specialServices = specialServices;
    }

    String getSpecialServices(){
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    void updateSpecialServices() {
        this.specialServices = scan.nextLine() + this.specialServices;
        System.out.println(getSpecialServices());
    }
}
