package replit.Arrays;

/**
 * Given an array num, calculate the sum of all numbers in the array and print out to the console.
 * nums → [2, 1, 2, 3, 4]) → 12
 * nums → [2, 2, 0, 3, 5]) → 12
 * nums → [1, 3, 5, 7, 9]) → 25
 */
import java.util.*;
public class Find_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below
        int sum = 0;
        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
