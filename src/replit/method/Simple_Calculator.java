package replit.method;

/**
 * Implement the plus method. The return is void and has no arguments.
 * The method should ask the user to input two numbers, then it will add them and print the result.
 * Hint: Create a scanner within plus method.
 * Example:
 */
import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        plus();
    }
    // Do not touch above
    public static void plus() {
        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = scan.nextInt();
        System.out.println("enter second number:");
        int second = scan.nextInt();
        System.out.println("result: " + (first+second));
    }
}
