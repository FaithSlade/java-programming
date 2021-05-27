package day18_condition_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args){
        int number = 5;

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {  // else if (number == 0)
            System.out.println(number + " is zero");
        }
    }
}
