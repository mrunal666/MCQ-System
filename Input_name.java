package com.company;
import java.util.Scanner;
/*
* This is responsible for asking users to enter their names
* */
public class Input_name {

    /*method for user name prompt*/

        String name;
        public  String prompt() {
            System.out.println("Enter Your Name");
            Scanner fname = new Scanner(System.in);
            name = fname.nextLine();
            System.out.println();
            return name;
        }
    }

