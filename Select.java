package com.company;

import java.util.Scanner;

public class Select {

/*Checks the chosen set and open csv file accordingly*/

    int selectedOpt;
    public int forselect() {

        /*responsible for the users choice of mcq set*/
        System.out.println("Choose Your Multiple Choice Question Set. ");
        System.out.println("Enter 1 or 2");
        System.out.println("\n1- Java Basics");
        System.out.println("2- HTML");
        Scanner input = new Scanner(System.in);
        selectedOpt = input.nextInt();

        //validates the input in case user enters incorrect choice

        if (selectedOpt != 1 && selectedOpt != 2) {
            System.out.println("Please enter 1 or 2");
            forselect();
        }
        return selectedOpt;
    }
}
