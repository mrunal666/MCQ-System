package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*This class conducts mcq test on Java
 * Gives number of correct and wrong answers
 * */

public class Java_Mcq_Set {
    int sum;
    String quesset = "Java basics.csv ";
    File javafile = new File (quesset);
    int COUNT = 0;

    public int choose() {
        /*this method is responsible for getting
        questions and their alternatives from CSV file*/

        try{
            Scanner scanner = new Scanner(javafile);
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                String[] split = data.split(",");
                System.out.println();

                /*Display options*/

                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);
                System.out.println(split[3]);
                System.out.println(split[4]);
                int answer = Integer.parseInt(split[5]);
                Options ans = new Options();
                int choose = ans.check();

               /*count correct and incorrect answers */

                        if (choose == answer) {  //checks answers
                            System.out.println("Correct!");
                            System.out.println();
                            COUNT++;
                            sum++;
                        } else {
                            System.out.println("Wrong! " + split[answer]+ " is the correct answer.");
                            System.out.println();
                            sum++;
                        }
            }
            scanner.close();
 //exception handling

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return COUNT;
    }
}
