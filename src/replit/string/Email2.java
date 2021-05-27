package replit.string;

/**
 * Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
 * Ex: Input: craig_federighi@apple.com
 * Output:
 * First name: Craig
 * Last name: Federighi
 * Domain: apple
 */
import java.util.Scanner;
public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underscore = email.indexOf("_");
        int at = email.indexOf("@");
        int end = email.indexOf(".");

        String firstUp = email.toUpperCase().substring(0,1);
        String firstLow = email.toLowerCase().substring(1,underscore);
        System.out.println("First name: " + firstUp+ firstLow);

        String secondUp = email.toUpperCase().substring(underscore+1,underscore+2);
        String secondLow = email.toLowerCase().substring(underscore+2,at);
        System.out.println("Last name: " + secondUp+secondLow);

        String thirdLow = email.toLowerCase().substring(at+1,end);
        System.out.println("Domain: " + thirdLow);
    }
}
