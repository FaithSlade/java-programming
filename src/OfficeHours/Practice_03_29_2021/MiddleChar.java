package OfficeHours.Practice_03_29_2021;

/**
 * Given a String, write a program to display the middle character of a string
 * a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
 * Ex:
 * Input: elephant
 * Output: The middle characters: ph
 */
public class MiddleChar {
    public static void main(String[] args) {
        /*
            Odd:

             apple
             01234
             p -> 2     5/2 -> 2

             dog
             012
             o -> 1      3/2 = 1

             even        4/2 = 2
             0123
         */

        String word = "even";

        if(word.length() % 2 == 1) {
            // odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2 + 1));
//            word.length()/2 + 1 this one will not read that character cause it substring
        } else {
            // even
            int index = word.length()/2; // it will print e cause word/2 -> we want it to print ve in the middle
            System.out.println(word.charAt(index-1) + "" + word.charAt(index));
            System.out.println(word.substring(index-1, index+1)); // can't put just index
        }
    }
}
