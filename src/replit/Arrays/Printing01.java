package replit.Arrays;

/**
 * The code provided in your main method will take in five Strings
 * and save them into an array called arr.
 * Print out the first three letter of each element on separate lines.
 * You can assume that every element of arr is at least 3 letters long.
 * Example:
 * arr -> ["hello", "how", "are", "you", "doing"]
 *
 * Output:
 * hel
 * how
 * are
 * you
 * doi
 */
import java.util.Scanner;
public class Printing01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!

        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k].substring(0,3));

            }
        }
    }

