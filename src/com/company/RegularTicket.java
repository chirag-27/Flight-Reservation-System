package com.company;

import java.util.Scanner;

public class RegularTicket {
    Scanner scan = new Scanner(System.in);
    private String specialServices;

    public RegularTicket(String specialServices) {
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
