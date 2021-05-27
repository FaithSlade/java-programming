package day38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {

    }

    public static void printArray(int[] nums) {
        for (int nums1 : nums) {
            System.out.print(nums1 + " ");
        }
        System.out.println("");
    }

    public static int sum(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            total = nums[i] + nums[i + 1];
        }
        return total;
    }

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (each == num) {
                found = true;
                break;
            }
        }
        return found;
    }

/*
        int count = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    count++;
                }
            }
        }
        if (count == num) {
            return true;
        }
        return false;
    }
 */
}