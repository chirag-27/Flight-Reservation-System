package com.company;
import java.util.Scanner;
public class Contact {
    String name;
    String phone;
    String email;
    Scanner scan = new Scanner(System.in);
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String getContactDetails(){
        return "name:" + name +", phone:" + phone + ", email:" + email;
    }
    void updateContactDetails(){
        System.out.println("Update contact details.");
        System.out.println("1.name 2.phone 3.email 4.no updates");
        int a = scan.nextInt();
        switch(a){
            case 1:
                this.name = scan.next();
                System.out.println("Updated contact details are:" + getContactDetails());
                break;
            case 2:
                this.phone = scan.next();
                System.out.println("Updated contact details are:" + getContactDetails());
                break;
            case 3:
                this.email = scan.next();
                System.out.println("Updated contact details are:" + getContactDetails());
                break;
            case 4:
                System.out.println("Thank you!");
                break;
        }
    }
}
