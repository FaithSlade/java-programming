package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; // single variable
// it still 0 nums/default value now = 0
// when you type [] java wii know automatic its array and store it in int data type
// and [3]number mean the side that array hold int values. you can change it anytime
// array it start from [0] base = index number

// *first ways to do array:
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
  //    nums[3] = 20; //outofbound cause we store array only 3 side at nums,it already have 0, 1 , 2 = 3

 //*print values of array:
 //       System.out.println(nums); -> it will hashcode -> [I@5cad8086
        System.out.println("value at index 0 = " + nums[0]); //index 0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);
        
//    we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);  //print 5 cause i = 0 -> [0] = 5
        i++;
        System.out.println(nums[i]);  //10

//        how to find out the side of the array or array side:
        System.out.println("number of elements = " + nums.length); // length not have () for array

//     store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len); // len = 3

//     change values in the array:
        nums[0] = 100;
        nums[1] = 300;
//       read the value of index 1 and assign same to index 2
        nums[2] = nums[1];

        System.out.println("value at index 0 = " + nums[0]); // 100
        System.out.println("value at index 1 = " + nums[1]); // 300
        System.out.println("value at index 2 = " + nums[2]); // 300
    }
}
