package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args){
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        // it will change forever, if you want to change it back just call reverse one more time
        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        Collections.frequency(letters,'a');// use when you looking for unique character
        System.out.println(Collections.frequency(letters,'a'));//2

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);//javaisfun reverse it back
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);
        
//              Arrays         !=                List
//      ArrayList<Integer> nums = Arrays.asList(23, 1, 4, 55, 87, 67); ERROR 
        List<Integer> nums = Arrays.asList(23, 1, 4, 55, 1, 87, 67, 0, -7, 5, 5, 5, 5, 5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums = " + nums);
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOfFive = Collections.frequency(nums,5);
        System.out.println(countOfFive);//5

        int countOf1 = Collections.frequency(nums,1);
        System.out.println("countOf1 = " + countOf1);

        Collections.replaceAll(nums, 87, 50);// change 87 to 50
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums);
        System.out.println("nums = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle => "+nums);
    }
}
