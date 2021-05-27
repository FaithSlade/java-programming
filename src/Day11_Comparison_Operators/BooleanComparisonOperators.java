package Day11_Comparison_Operators;

public class BooleanComparisonOperators {
    public static void main(String[] args){
        System.out.println(10 == 10);  // true 10 equals 10
        System.out.println(1000 > 100);  //true 1000 greater than 100
        System.out.println(985.44 < 98547.8);  // true less than
        System.out.println(10 <= 10);  // true
        System.out.println(5 >= 3);  // true
        System.out.println(-100 != 44);  //true -100 IS_NOT_EQUALS 44

        int a = 100;
        int b = 200;
        System.out.println(a == b);  //false
        System.out.println(a > b);  //false
        System.out.println(a < b);  //true
        System.out.println(a >= b);  //false
        System.out.println(a <= b);  //true
        System.out.println(a != b);  //true

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");  //true
        System.out.println(city == "Baku");  //false
        System.out.println(city != "Fairfax");  //true

        String name = "Nadir";
        boolean checkName = name  == "Nadir";
        System.out.println("checkName = " + checkName);

        checkName = name != "Kuzzat";  //true
    }
}
