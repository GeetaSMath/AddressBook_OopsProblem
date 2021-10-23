package com.bridgelabz;
import java.util.*;

//Here We are adding New Contact information
//Arraylist as object to creat Person information
//ArratList<String> TypeCasting

public class AddressBook_AddContact {


    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        AdressBook_Oops book1 = new AdressBook_Oops();
        ArrayList<String> man1 = new ArrayList<String>();


        System.out.println("Add a new Contact to Address Book");

        System.out.print("Enter First Name : ");
        String fN = sr.nextLine();
        book1.setFirstName(fN);
        man1.add(0, book1.getFirstName());


        System.out.print("Enter Last Name : ");
        String lN =sr.nextLine();
        book1.setLastName(lN);
        man1.add(1, book1.getLastName());

        System.out.print("Enter Email-id : ");
        String eId = sr.nextLine();
        book1.setEmail(eId);
        man1.add(2, book1.getEmail());

        System.out.print("Enter Cell Num : ");
        String cell = sr.nextLine();
        book1.setCellNum(cell);
        man1.add(3, book1.getCellNum());

        System.out.print("Enter City : ");
        String city = sr.nextLine();
        book1.setCity(city);
        man1.add(4, book1.getCity());

        System.out.print("Enter Zip : ");
        String zIp = sr.nextLine();
        book1.setZip(zIp);
        man1.add(5, book1.getZip());

        System.out.print("Enter Sate : ");
        String state = sr.nextLine();
        book1.setState(state);
        man1.add(6, book1.getState());

        System.out.println(man1);

        System.out.println(" First Name: "+man1.get(0)+"\n Last Name: "+man1.get(1)+"\n Cell Num: "+man1.get(2)+"\n Email-id: "+man1.get(3)+"\n City: "+man1.get(4)+" \n Pin: "+man1.get(5)+"\n State: "+man1.get(6));


    }
}
