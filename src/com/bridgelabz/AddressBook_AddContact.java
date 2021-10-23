package com.bridgelabz;
import java.util.Scanner;
//Here its Main method to Execute a
// By creating object we are Calling Contact from AddressBook_Oops
public class AddressBook_AddContact {
        public static void main(String[] args) {
            AdressBook_Oops b = new AdressBook_Oops();
            System.out.println("Welcome to Address Book Program");

            b.setFirstName("Geeta");
            b.setLastName("Madabalmath");
            b.setCellNum("9902630725");
            b.setEmail("geetasmath.com");
            b.setCity("Gulbarga");
            b.setZip("585104");
            b.setState("Karnataka");


//* Here We displying contact of the person
            System.out.println(" First Name: "+b.getFirstName()+"\n Last Name: "+b.getLastName()+"\n Cell Num: "+b.getCellNum()+"\n Email-id: "+b.getEmail()+"\n City: "+b.getCity()+" \n Pin: "+b.getZip()+"\n State: "+b.getState());

        }
    }





