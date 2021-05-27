package replit.loops;

/**
 * Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.
 * Example:
 * input: 1
 * output: *
 * Example:
 * input: 3
 * output: ***
 */
import java.util.Scanner;
public class Print_N_Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE

        while (n>0)
        {
            System.out.print("*");
            n--;
        }
    }
}
