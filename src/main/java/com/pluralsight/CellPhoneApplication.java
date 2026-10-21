package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();

        cellPhone.setSerialNumber(promptForInt("What is the serial number? "));
        cellPhone.setModel(promptForString("What model is the phone? "));
        cellPhone.setCarrier(promptForString("Who is the carrier? "));
        cellPhone.setPhoneNumber(promptForString("What is the phone number? "));
        cellPhone.setOwner(promptForString("Who is the owner of the phone? "));

        System.out.println();
        System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());
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
}
