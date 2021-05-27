package day29_nestedloop_arrays;

public class ArraysPractice {
    public static void main(String[] args) {
// *first ways to do array:
        int[] nums = new int [2];  //{0,0}
        System.out.println(nums[0]);
        System.out.println(nums[1]);

// *declare int array counters and assign 5 values
//      int counter[] -> can do this ways too
        int[] counter = {25, 40, 55, 100, 103};
        int[] counter1 = {25, 40, (int)55.0, 100, 103};
//                                     |
//        we need to casting it double is decimal

// *declare double array prices and assign 3 prices
        double[] prices = {23.99, 100, 44.33};
//                                 |
//        we don't need to casting it automatic cast

// *declare String array cities and assign 4 city names
        String[] cities = {"dublin", "san ramon", "livermore", "walnut creek"};
    }
}
