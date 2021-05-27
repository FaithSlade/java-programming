package day24_loops;
import java.util.*;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollar = scan.nextInt();
// it will stop when your input on scanner is 5
//        so if you put 100 condition is true cause 100 != 5
        while (dollar != 5) // run
        {
            System.out.println("Give me 5 dollars"); //keep asking//if false this statement will not run
            dollar = scan.nextInt();// give input again
        }
        System.out.println("Thank you for 5 dollars");//print when input is 5 cause 5 != 5 is false
        }
    }

