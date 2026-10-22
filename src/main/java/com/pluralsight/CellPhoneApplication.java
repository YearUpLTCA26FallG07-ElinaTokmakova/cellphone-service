package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(11257777, "Samsung", "Verizon", "999-999-9999", "Andre");

        enterAllDetails(cellPhone1);         // prompt for phone (all details)

        System.out.println();

        enterContactOnly(cellPhone2);        // prompt for phone (owner and number only)

        System.out.println();

        display(cellPhone1);  //display owner and phone for each phone
        display(cellPhone2);
        display(cellPhone3);

        System.out.println();

        cellPhone1.dial(cellPhone2.getPhoneNumber());        //first phone calling second one
        cellPhone2.dial(cellPhone1.getPhoneNumber());        //second phone calling the first one
        cellPhone1.dial(cellPhone3);                         //first phone calling the third one
    }

    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int promptForInt(String prompt){
        System.out.print(prompt);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    //method for entering data for phone with all details
    public static void enterAllDetails(CellPhone phone) {
        phone.setSerialNumber(promptForInt("What is the serial number? "));
        phone.setModel(promptForString("What model is the phone? "));
        phone.setCarrier(promptForString("Who is the carrier? "));
        phone.setPhoneNumber(promptForString("What is the phone number? "));
        phone.setOwner(promptForString("Who is the owner of the phone? "));
    }

    //method for entering data for phone with owner and number only
    public static void enterContactOnly(CellPhone phone) {
        phone.setPhoneNumber(promptForString("What number do you wanna call? "));
        phone.setOwner(promptForString("Who are you you calling? "));
    }

    //method for displaying phone number and owner
    public static void display(CellPhone phone) {
        System.out.println(phone.getOwner() + " " + phone.getPhoneNumber());
    }
}
