package replit.method;

/**
 * Complete the method isPalindrome() that will check if number is a palindrome.
 * Print your result as a boolean (true or false).
 * Challenge: Do not convert int into a string!
 *
 * Examples:
 * input: 1001
 * output: true
 *
 * input: 1234
 * output: false
 */
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        int newNum = num;
        int reverse = 0;

        for (int i = 0; i <= newNum; i++) {
            if(i == newNum%10){ //if i = the remainder of int devided by 10(which gives the last digit of int)
                int holdI = newNum%10;//just i
                newNum = newNum/10;//decreasing numTemp to make if statement valid again
                reverse = reverse * 10 + holdI;//*10 will make previous temp digit bigger by 10 every time when next loop cycle is run
                i=0;////dropping value of i back to 0 with each loop cycle
            }
        }
        boolean isPalindrome = (num == reverse) ? true : false;
        System.out.println(isPalindrome);
    }
}
