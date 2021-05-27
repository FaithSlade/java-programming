package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args){
        System.out.println(10 / 3); //3
        System.out.println(5 / 2);  //2
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1 / num2);  //2
        System.out.println(5.0 / 2.0);  //2.5
        System.out.println(5.0 / 2);  //2.5
//        if you add the decimals number the resulted will be decimals number.

        double d1 = 12.0;
        double d2 = 5.0;
        System.out.println(d1 / d2);  //2.4
//        we will getting decimal resulted.
        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount);  //3.33.. decimal number still

    }
}
