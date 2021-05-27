package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
//                     0123
        String word = "java";
        System.out.println(word.charAt(0)); //j
        System.out.println(word.charAt(1)); //a
        System.out.println(word.charAt(2)); //v
        System.out.println(word.charAt(3)); //a
//        System.out.println(word.charAt(4)); ERROR
        System.out.println(word + "-" + word.length()); // have 4 character

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));//C
        char first = company.charAt(0); // how we know its char? bring mouse over letter it will show
        System.out.println(first);
//        C y b e r t e k

        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        System.out.println(first + " " + second + " " + third + " " + fourth + " "
        + fifth + " " + sixth + " " + seventh + " " + eighth);
        
        String withSpaces = (first + " " + second + " " + third + " " + fourth + " "
                + fifth + " " + sixth + " " + seventh + " " + eighth);
        System.out.println("withSpaces = " + withSpaces);
    }

}
