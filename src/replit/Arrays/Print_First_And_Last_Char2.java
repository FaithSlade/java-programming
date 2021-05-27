package replit.Arrays;

/**
 * Given a String array words, iterate through each word and print first and
 * last letter of each element in the format below. Put each first and
 * last letter in an array.
 * Example:
 * words → ["hello", "why", "by", "apple" , "note"]
 * print → [ho, wy, by, ae, ne]
 */
import java.util.*;
public class Print_First_And_Last_Char2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        //TODO: Write your code below


        for(int i = 0; i < words.length; i++){
            words[i] = ""+ words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(words));

    }
}
