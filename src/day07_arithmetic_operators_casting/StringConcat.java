package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java" + 5 + 3);
//        java53 -> it will be part of String cause java read left to right
//        "String" + concatenate -> it make concatenate become String.
        System.out.println("java" + (5 + 3));
//      Java will calculate number in parentheses first.
        System.out.println(5 + 3 + "java");//8java
        System.out.println(5 + (3 + "java"));
//        3+java become String = 53java
        System.out.println("hello" + 1 + 2 + 3); //hello123 -> String
        System.out.println("hello" + (1 + 2 + 3)); //hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2);
        System.out.println(str1 + " " + str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);//15
        System.out.println(num1 + " " + num2);
        // it showed 7 8 cause string in the middle

        System.out.println(num1+""+num2); //78
        char char1 = 'a';
        char char2 = 'b';

        System.out.println(char1 + "" + char2); // ab

    }
}