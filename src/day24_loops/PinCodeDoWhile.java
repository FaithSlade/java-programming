package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to you account");
        int secretPinCode = 1234;
        int pinCode; // don't need to add number now just declared fine
//        declare here so that visible for while condition
        do{
            System.out.println("Please Enter your Pin number");
            pinCode = scan.nextInt();
// you cannot declare variable inside the loop not ERROR
// eventually you can do it but it will visible to see it outside the loop
        } while(secretPinCode != pinCode);
//   as long as you keep entering wrong number it will not exit the loop
        System.out.println("Select the menu");
    }
}
