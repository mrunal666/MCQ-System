package com.company;
/*Main class of the project*/
public class Mainpage {

    public static void main(String[] args) {
        Input_name put = new Input_name(); //User name prompt
        String user = put.prompt();
        Select load = new Select(); //Loads respective set based on users choice
        int file = load.forselect();
        if (file == 1) {  //for javaMCQs
            Java_Mcq_Set mcq = new Java_Mcq_Set();
            int right= mcq.choose();
            int total = mcq.sum; //correct answers
            int wrong = total-right; //incorrect answers
            int grade = (right * 100) / total; //percentage
            System.out.println(user + " ,you Answered  " + right + " questions right and , " +  wrong+ " questions wrong For the total" + total);
            System.out.println("Your percentage for the is "+grade + "%");
        }
        else if (file == 2) { // for htmlMCQs
            Html_Mcq_Set mcq = new Html_Mcq_Set();
            int right =  mcq.html();
            int total = mcq.sum; //correct answers
            int wrong = total-right; //incorrect answers
            int grade = (right * 100) / total; //percentage
            System.out.println(user + " ,you have got  " + right + " questions right and " +  wrong + " questions wrong. For the total" + total);
            System.out.println("Your percentage for the is "+grade);
        }
    }
}
