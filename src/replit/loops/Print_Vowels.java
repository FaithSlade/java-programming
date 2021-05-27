package replit.loops;

/**
 * Create a program that will take the given String In and print out all the vowels from the String.
 * Example:
 * Input: howdyho
 * Output: oo
 * Input: huehuehuehue
 * Output: ueueueue
 */
import java.util.Scanner;
public class Print_Vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)  == 'a'  || word.charAt(i)  == 'u' ||
                word.charAt(i)  == 'e' || word.charAt(i)  == 'o' ||
                word.charAt(i)  == 'i') {
                System.out.print(word.charAt(i));
            }
        }
    }
}
