package replit.Arrays;

/**
 * Given a String array words, iterate through each word and print first
 * and last letter of each element in separate lines.
 * Example:
 * words → ["hello", "why", "by", "apple" , "note"]
 * print:
 * ho
 * wy
 * by
 * ae
 * ne
 */
import java.util.*;
public class Print_First_And_Last_Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        String newWord = "";
        for(int i = 0; i < words.length; i++){
            newWord += ("" + words[i].charAt(0) + words[i].charAt(words[i].length()-1)+" ");
        }
        String printWord = newWord.replace(" ", "\n");
        System.out.println(printWord);
    }
}
