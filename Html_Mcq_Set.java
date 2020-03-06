package com.company;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/*This class conducts mcq test on html
* Gives number of correct and wrong answers
* */
    public class Html_Mcq_Set {

        int sum;
        String filenname = "HTML.csv";
        File quesset = new File(filenname);
        int constant = 0;

        public int html() {
                /*this method is responsible for getting
        questions and their alternatives from CSV file*/

            try {
                Scanner scanner = new Scanner(quesset);
                while (scanner.hasNext()) {
                    String data = scanner.nextLine();
                    String[] split = data.split(",");
                    System.out.println();

                    /*options for questions*/

                    System.out.println(split[0]);
                    System.out.println(split[1]);
                    System.out.println(split[2]);
                    System.out.println(split[3]);
                    System.out.println(split[4]);
                    int answer;
                    answer = Integer.parseInt(split[5]);
                    Options a = new Options();
                    int choose = a.check();

                    /*counts correct and incorrect answers */

                    if (choose == answer) {//checks answers
                        System.out.println("Correct!");
                        System.out.println();
                        constant++;
                        sum++;
                    } else {
                        System.out.println("Wrong!" + split[answer] + " is the correct answer.");
                        System.out.println();
                        sum++;
                    }
                }
                scanner.close();
            }

            //exception handling
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }


                return constant;




        }
    }