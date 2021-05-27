package day09_scannaer_practice;


import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("###### Miles to Kilometer converter ######");
        System.out.println("Enter miles:");
        double miles = scan.nextDouble();
        double covertToKilometer = miles * 1.609;

        System.out.println(miles + " miles = " + covertToKilometer + " kilometer");

    }
}
