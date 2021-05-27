package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        //System.out.println();
        //int static = 22 -> error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234; //-> Camel case

        int salary$ = 55;
//      int 1stMonthSalary = 3000; -> error, can not start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variable work fine. but not recommended
        // we should use meaningful variable names
        //int number-of-friends = 400; ->ERROR
        int numberOfFriends = 401;   // popular
        int number_of_friends = 401; // not convention
    }
}