package OfficeHours.Practice_03_31_2021;

/**
 * Count upper, lower, and numbers
 * Given a String, find and print how many
 * uppercase letter, lowercase letter, and number are in the String.
 * Ex:Input: 2juMp41EEkd4s4
 * Output:
 * 3 uppercase letters
 * 6 lowercase letters
 * 5 numbers
 */
public class CountUpperLowerOrNumber {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase = 0, number = 0;

        for(int i=0; i < str.length(); i++) { // if you put <= it OutOfBound cause last length() is including

            char eachLetter = str.charAt(i); // 2 -> ascii value: 50

            if(eachLetter >= 'A' && eachLetter <= 'Z') { //or can use 65 instant of a that ok too
                upperCase++;
            } else if(eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;
            } else if(eachLetter >= '0' && eachLetter <= '9'){ // range of 48 - 57 -> number we consider as a character
                number++;
            }

        }

        System.out.println("uppercase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);
    }
}
