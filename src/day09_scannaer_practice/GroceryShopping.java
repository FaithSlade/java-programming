package day09_scannaer_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk");
        double price1 = scan.nextDouble();

        System.out.println("Enter price for bread");
        double price2 = scan.nextDouble();

        System.out.println("Enter price for cucumber");
        double price3 = scan.nextDouble();

        double totalPrice = price1 + price2 + price3;
        System.out.println("total price is $" + totalPrice);
    }
}
