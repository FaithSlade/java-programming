package day18_condition_practice_strings_intro;
import java.util.Scanner;
public class Authentication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter last 4 digit of your SSN number");
        int last4SSN = input.nextInt();
        System.out.println("Please enter your pin number");
        int pinCode = input.nextInt();

        int expLast4SSN = 9899;
        int expPinCode = 4321;

        if (last4SSN == expLast4SSN && pinCode ==expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }
//            Read the comment below for this statement
            if (pinCode != expPinCode){
                System.out.println("Pin number is incorrect");
            }
//            use if by it self for every if statement will check
//            but if you use else if when it find the correct statement java stop
//            checking statement below
        }
    }
}
