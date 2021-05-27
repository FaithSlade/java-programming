package OfficeHours.Practice_03_30_2021;
/**
 * • Write a program that will ask ‘upper’ or ‘lower’
 * • If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
 * - Challenge: Also ask if they want to show the alphabet in ascending or order descending
 * - Ascending:A–Zora–z
 * - Descending:Z–Aorz–a
 */

import java.util.Scanner;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = input.next();
        int starting;
        int ending;

        if(upperOrLower.equals("uppercase")) {
            starting = 'A'; //A =65, in for loop int i= starting -> starting = 65 number that why we need to casting it
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }

        if(ascendingOrDescending.equals("ascending")) {
            for(int i= starting; i <= ending; i++) { //for loop allow you to control the number
                System.out.print((char)i + " ");
//                                  |
 //casting it to char to make ascii number become to character
            }
        } else {
            for(int i= ending; i >= starting; i--) {  //run back ward
                System.out.print((char)i + " ");
            }
        }
    }
}
