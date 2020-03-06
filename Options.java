package com.company;

import java.util.Scanner;
// class responsible for verifying the options entered by users
public class Options {
    int count;
    public  int check() {
        Scanner ok  = new Scanner(System.in);

        // expresses that upper case characters are equal to lower case characters

        String check = ok.next();
        System.out.println();
        if (check.equals("a")  ||  check.equals("A")){
            count = 1;
            return count;
        }
        else if(check.equals("b")  ||  check.equals("B")) {
            count = 2;
            return count;
        }
        else if(check.equals("c")  ||  check.equals("C")) {
            count = 3;
            return count;
        }
        else if(check.equals("d")  ||  check.equals("D")) {
            count = 4;
            return count;
        }
        else {
            System.out.println("Invalid Input");
            check();
        }
        return count;
    }
}
