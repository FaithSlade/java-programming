package OfficeHours.Practice_04_06_2021;

/**
 * CHALLENGE - THIS WILL MAY BE DIFFICILT BUT TRY IT. DON'T SPEND TOO MUCH TIME
 * Generate a random number that is six digits long. Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.HINTS: Loops, Strings, Random
 */
import java.util.*;
public class RandomSixDigitNumber {
    public static void main(String[] args) {

        Random random = new Random();
        String randomNumber = "";

        while (randomNumber.length() != 6){  // mean stop the loop when you have 6 character
            int eachRandom = random.nextInt(10);  //0-9 it not including 10
//          int eachRandom = random.nextInt(9)+1; 1-9  changing the range
            if(!randomNumber.contains(""+eachRandom)){  // can't not be duplicate number
                randomNumber += eachRandom;
            }
        }
        System.out.println("Random Number: " + randomNumber);
    }
}
