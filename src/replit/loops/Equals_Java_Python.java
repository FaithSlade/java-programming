package replit.loops;

/**
 * Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
 *Example:
 * input: We study java not python
 *output: true
 * input: What's the difference between java, javascript and python?
 *output: false
 */
import java.util.Locale;
import java.util.Scanner;
public class Equals_Java_Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int java = 0;
        int python =0;

        for (int i = 0; i < sentence.length()-3; i++) {
            if (sentence.substring(i,i+4).equals("java")) {
                java++;
            }
        }
         for (int i = 0; i < sentence.length()-5; i++) {
                if (sentence.substring(i,i+6).equals("python")) {
                    python++;
                }
            }
        System.out.println(java == python ? "true" : "false");
        }
    }
