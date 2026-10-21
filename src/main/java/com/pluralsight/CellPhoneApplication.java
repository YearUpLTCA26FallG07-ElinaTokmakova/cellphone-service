package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static Scanner scanner = new Scanner.(System.in);

    public static void main (String[] args) {
        CellPhone serialNumber = promptForInt("What is the serial number?");
        CellPhone model = promptForString("What model is the phone?");
        CellPhone carrier = promptForString("Who is the carrier?");
        CellPhone phoneNumber = promptForString("What is the phone number?");
        CellPhone owner = promptForString("Who is the owner of the phone?");
    }

    public static int promptForInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
