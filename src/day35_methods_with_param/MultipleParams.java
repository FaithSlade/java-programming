package day35_methods_with_param;

import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 double:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        showSum(d1,d2);
        showSum(10.45,55.89);
    }
//                                (10.45,       55.89);
//                                   |            |
    public static void showSum(double num1, double num2){  //you can do as much as we want
        System.out.println(num1);
        System.out.println(num2);
        double sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
