package replit.Arrays;

/**
 Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
 You may modify and print the given array, or print a new array.`
 Example:
 input: 6, 2, 5, 3
 output: [2, 5, 3, 6]
 */
import java.util.*;
public class Shift_Left {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int newNum = nums[0];
        for (int i =0; i < nums.length-1 ; i++){
            nums[i] = nums[i+1];
        }
            nums[nums.length-1] = newNum;
        System.out.println(Arrays.toString(nums));
    }
}
