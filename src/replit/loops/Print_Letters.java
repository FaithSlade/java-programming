package replit.loops;
/**
 Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
 Example:
 input:
 A
 Z
 output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */
import java.util.Scanner;
public class Print_Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char i = start ; i < end+1; i++) {
            if(start < end){
                System.out.print(i);
            }
        }
    }
}
