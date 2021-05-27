package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//you can use only import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
//      declare Integer arraylist with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println("nums = " + nums);

        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nuniquelist = " + uniqueList);
    }
//              return data type                   input data type
//                      |                                 |
    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
//      new arraylist to store only unique numbers
        List<Integer> uniqueList = new ArrayList<>();

//      loop through the list
        for(int each : nums){ //auto unboxing or you can do for(Integer each : nums)
//          check if number appears only ONCE in the list
            if(Collections.frequency(nums, each) == 1){
                System.out.print (each + " ");//print that number
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
