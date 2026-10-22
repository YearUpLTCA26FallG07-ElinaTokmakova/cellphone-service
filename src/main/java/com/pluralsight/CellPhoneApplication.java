package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        //input for my phone
        enterAllDetails(cellPhone1);

        System.out.println();

        //input for other phone (only number and owner)
        enterContactOnly(cellPhone2);

        System.out.println();

        //display my phone and other phone (only number and owner)
        display(cellPhone1);
        System.out.println(); //extra blank line
        display(cellPhone2);

        System.out.println();

        //first phone calling second one
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        //second phone calling the first one
        cellPhone2.dial(cellPhone1.getPhoneNumber());
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
        phone.setOwner(promptForString("Who is the owner of the phone? "));;
    }

    //method for entering data for phone with owner and number only
    public static void enterContactOnly(CellPhone phone) {
        phone.setPhoneNumber(promptForString("What number do you wanna call? "));
        phone.setOwner(promptForString("Who are you you calling? "));
    }

    //method for displaying phone number and owner
    public static void display(CellPhone phone) {
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
