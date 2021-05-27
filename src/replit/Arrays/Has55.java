package replit.Arrays;

/**
 * Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array. If no consecutive 5s or no 5s are detected in your code then print false.
 * nums → [1, 5, 5, 1, 1] → true
 * nums → [1, 8, 5, 5, 0] → true
 * nums → [1, 5, 4, 1, 5] → false
 * nums → [1, 4, 4, 1, 99] → false
 */
import java.util.*;
public class Has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:

        boolean has5 = true;
        for (int i = 0; i < nums.length-2; i++) { //length-2 cause we need to read the last two
            if (nums[i] == 5 && 5 == nums[i+1]) {
                has5 = true;
                break;
            } else {
                has5 = false;
            }
        }
        System.out.println(has5);
    }
}
