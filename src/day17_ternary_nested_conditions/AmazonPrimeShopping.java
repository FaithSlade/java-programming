package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 50.0;
        boolean isPrimeMember = true;

        //(isPrimeMember) can write just only variable cause it already boolean
        if (isPrimeMember == true) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice >= 25.0) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }
    }
}
