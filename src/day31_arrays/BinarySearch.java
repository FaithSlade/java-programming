package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums,23));  //print indexOf number 1
        System.out.println(Arrays.binarySearch(nums,2344));  //print indexOf number 4
        System.out.println(Arrays.binarySearch(nums,25));  //print indexOf number -3
//       25 it not in Arrays so it will be negative number
//        if 25 have in arrays it should be between 23, 123 that why it -3
        System.out.println(Arrays.binarySearch(nums,700));  //-5
        System.out.println(Arrays.binarySearch(nums,-5));  //0

//        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421, 1}; have 1 it behind it will run
//        but don't trust the result cause it need to be sort small to large

//        check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }
    }
}
