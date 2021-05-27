package day43_list_custum_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    /**
     * getIntegerList
     * return List<Integer>
     *     loop from 0 - 1_000_000
     *     and add to ArrayList then return
     */

    public static void main(String[] args) {
        //1 second = 1_000_000_000 nanoseconds
       // System.nanoTime(); to compare Array or ArrayList which one faster
        long start = System.nanoTime();// get start time
        List<Integer> newNums = getIntegerList();//return ready ArrayList object. no need new ArrayList<>();
        long end = System.nanoTime();// get ending time

        double listSeconds = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start));//print duration
        System.out.println("ArrayList time second = " + listSeconds);


        long st = System.nanoTime();
        int[] newNumsA = getIntegerArray();
        long en = System.nanoTime();

        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (end - start));
        System.out.println("Array time second = " + seconds);
    }
    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1_000_000; i++) {
            nums.add(i);
        }
          return nums;
    }
    /**
     * getIntegerArray
     * No parameter
     * return List<Integer>
     *     loop from 0 - 1_000_000
     *     and add to int[] then return it
     */
    public static int[] getIntegerArray(){
        int[] nums = new int[1_000_001];
        for (int i = 0; i < 1_000_001; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
