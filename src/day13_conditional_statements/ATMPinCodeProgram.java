package day13_conditional_statements;
import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**** WELCOME TO CHASE BANK ATM ****");
        System.out.println(" Please Enter You Pin:");

        int secretPinCode = 9876;
        int inputPinCode = scan.nextInt();

        if (inputPinCode == secretPinCode) {
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect Pin code! 9876");
            System.out.println("Please try again.");
        }
        System.out.println("Thank you for using CHASE Bank ATM!");
    }
}