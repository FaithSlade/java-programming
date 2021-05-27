package day24_loops;

import java.util.*;
public class CountUntil {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter number to count until; ");
         int numberToStop = scan.nextInt();
         int start =1;
//to count up to the number that you put on the scanner
         while (start <= numberToStop)
         {
             System.out.print(start + " ");
             start++;
         }
         System.out.println("Done");
     }
//     output: 1 2 3 4 5 6 7 8 9 10 Done
}
