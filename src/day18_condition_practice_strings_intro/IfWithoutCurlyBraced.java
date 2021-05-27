package day18_condition_practice_strings_intro;

public class IfWithoutCurlyBraced {
    public static void main (String[] args){
        String todayClass = "python";

        if (todayClass.equals("java")) {
            System.out.println(todayClass + " is fun");
//  when don't put {} after if only one print statement is attach with if statement
//  so it will not print that statement nut else statement still print
        } else {
            System.out.println("It is not java but it is " + todayClass);
        }

        int a =1;
        if (a ==1) {
            System.out.println("a is 1");
            System.out.println("1 is a");
        }
    }
}
