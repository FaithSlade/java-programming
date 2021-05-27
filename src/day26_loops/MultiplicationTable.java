package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
       
        int number = 1;
        for (int num2 = 1; num2 <=60; num2++){
            System.out.print("5 * " + number + " ");
            System.out.println("= " + 5 * num2);
           int result = num2;
           number += 1;
        }

        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method
         */

        if (number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return; //exit main method/stop the program
        } //Exit the java program and print "ERROR: invalid input" just one time
//            if don't have return it will run forever.
        }
    }

