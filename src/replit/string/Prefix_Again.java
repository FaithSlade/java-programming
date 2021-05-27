package replit.string;
/**
 *Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.
 * Assume that the String is not empty and that n is in the range from 1 to str.length().
 * Examples:
 * input: abXYabc
 * input: 1
 * output: true
 * you will enter string, then number n And that number will show how many first carachters makes a prefix
 * then that prefix has to be found or not found in the rest of the string
 */

import java.util.Scanner;
public class Prefix_Again {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        if (remaining.contains(prefix)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

