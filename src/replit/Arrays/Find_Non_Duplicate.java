package replit.Arrays;

/**
 * Given an array nums with 7 integers every element is repeated twice - except one.
 * Find that element and print it to console.
 * Example:
 * nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */
import java.util.*;
public class Find_Non_Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below

        int nonDuplicate = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
                if (count == 1) {
                    nonDuplicate = nums[i];
                }
            }
            System.out.println(nonDuplicate);
        }
    }
