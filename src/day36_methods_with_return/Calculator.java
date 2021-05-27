package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        add(5, 6);// not print by it self: != void method
        System.out.println(add(5, 6));//11.0
        System.out.println(divide(10.0, 2.0));//5.0
        System.out.println(multiply(2.0, 10.0));//20.0
        System.out.println(subtract(10.0,3.0));//7.0

        double result = add(5, 6);// store in variable
        System.out.println("result = " + result);//result = 11.0
        System.out.println("100.0 + 200.0 = " + add(100, 200)); // we can concatenate: 100.0 + 200.0 = 300.0

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;// or return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }
    public static double multiply(double num1, double num2){
        double sum = num1 * num2;
        return sum;
    }
    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }
}
