package day14_multi_branch_if_statements;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int even = number % 2;
// remainder % by2
//    if the remainder is zero/0 then = even
//    if the remainder is one/1 then = odd

        //CODE HERE
        if (even == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }
}