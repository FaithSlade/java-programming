package day09_scannaer_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Cents value : ");
        int cents = scan.nextInt();
        int dollars = cents / 100; //because 100 cents is 1 dollars
        int remainingCents = cents % 100;

        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);

        System.out.println("In " + cents + " cents : " + dollars + " dollars " + remainingCents + " cents");
    }
}
