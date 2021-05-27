package replit.method;

/**
 * Create a method called next3 . This method has an int argument and
 * prints the next 3 numbers after that number.
 * Call the method from main method and pass num to it.
 * flow:
 * enter number
 * 1
 * next 3 are:
 * 2 3 4
 * (put a space between numbers)
 */
import java.util.Scanner;
public class Print_Next3_Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    // Do not touch above
    public static void next3(int num) {
        for (int i = 0; i < num; i++) {
            if (num == i) {
            }
        }
        System.out.println();
        System.out.println("next 3 are:");
        System.out.println(num + " " + (num + 1) + " " + (num + 2));
    }
}