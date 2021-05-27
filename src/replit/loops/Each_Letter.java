package replit.loops;

/**
 * Given a String, use a loop to print every character from the String on a new line.
 * Examples:
 * Input: hello
 * h
 * e
 * l
 * l
 * o
 */
import java.util.Scanner;
public class Each_Letter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        int next = 1;
        for(int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            next++;
        }
    }
}
