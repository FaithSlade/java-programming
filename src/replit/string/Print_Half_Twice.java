package replit.string;
/**
 * Write a program that will print out first half of the word twice.
 * Example: input: java
 * output: jaja
 */

import java.util.Scanner;
public class Print_Half_Twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int num = word.length()/2;
        System.out.println(word.substring(0,num)+word.substring(0,num));
    }
}
