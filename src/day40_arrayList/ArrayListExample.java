package day40_arrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
//      nums.add("java");ERROR cause it <Integer> type now

        System.out.println(nums.size());//size same as element or length

//      reading from arraylist
        System.out.println("index 0 = " + nums.get(0));//5 get mean index return value
        System.out.println("index 1 = " + nums.get(1));//7
        System.out.println("index 2 = " + nums.get(2));//11
     // System.out.println("index 3 = " + nums.get(3)); //index outOfBound

//        print all values in same line:
        System.out.println(nums);//Arrays.toString(numsArrays) ->[5, 7, 11]

        nums.remove(1);//remove element at index 1 -> this line will not print
        System.out.println(nums);//[5, 11]


    }
}
