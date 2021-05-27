package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//Polymorphic way of declaring
        System.out.println(nums);//[] cause nothing/empty no value != Arrays
        System.out.println("size = " + nums.size());//0
        
        nums.add(10); nums.add(20); nums.add(30); nums.add(40);
        nums.add(50); nums.add(60); nums.add(70); nums.add(0);
        nums.add(10); nums.add(20); nums.add(30); nums.add(40);
// it allow duplicate number
        System.out.println("nums = " + nums);//[10, 20, 30, 40, 50, 60, 70, 0, 10, 20, 30, 40]

//       remove by object not by index
        nums.remove(0);
        System.out.println("nums = " + nums);//[20, 30, 40, 50, 60, 70, 0, 10, 20, 30, 40]

//remove by object not by index: we use wrapper class now
//      nums.remove(40) -> index 40 : it IndexOutOfBoundException
        nums.remove(new Integer(40));//remove number 40, not index 40
// and it will remove the first one only if you want to remove all of them put in loop
        System.out.println("nums = " + nums);//[20, 30, 50, 60, 70, 0, 10, 20, 30, 40]

//for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++){ // use size instant of length
            System.out.print(nums.get(i) + " ");// use get(i) instant of [i]
            System.out.println("");

//foreach loop - work with ArrayList is one of the collection
            for(int each : nums){// int : we converting Integer to int : we called unboxing
// We can use this too:  for(Integer each : nums)  it's same
                System.out.print(each + " ");
            }
        }
    }
}
