package replit.loops;

/**
 * In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.
 * Example:
 * input: 5
 * output: 120
 * 5 * 4 * 3 * 2 * 1
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long factorial =1;
        int i =1;
        while(i <= n)
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
