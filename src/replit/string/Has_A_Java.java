package replit.string;

/**
 * Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.
 * Example:
 * input: javapython
 * output: true
 */
import java.util.Scanner;
public class Has_A_Java {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        boolean firstWord = word.substring(0).startsWith("java");
        boolean secondWord = word.substring(1).startsWith("java");
          if (word.length()>=4 && firstWord || secondWord ) {
            System.out.println(!exists);
        } else {
            System.out.println(exists);
        }
    }
}