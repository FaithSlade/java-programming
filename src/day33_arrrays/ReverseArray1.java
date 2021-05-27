package day33_arrrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
//          index     0   1  2   3
        int[] nums = {5, 10, 4, 100};
        int[] numsRev = new int[nums.length]; //set it to default {0, 0, 0, 0}

//                        i = 3 ,  j = 0
        for (int i = nums.length-1, j = 0; i >= 0; i--, j++){
            numsRev[j] = nums[i]; // to store i in to j default
//      i will start count from : 3 2 1 0
//      j will start count from : 0 1 2 3
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));
    }
}
