package day33_arrrays;

import java.util.Arrays;
public class ReverseArray2 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1); //10
        System.out.println("num2 = " + num2); //30

        System.out.println("-----swap those using additional variable------");

//        num2 = num1; // num2 = 10 then
//        num1 = num2;  num1 = 10 cause num2 already change the value to 10
//        System.out.println("num1 = " + num1); //10
//        System.out.println("num2 = " + num2); //10

//        To fixed it:
        int temp = num1;  //10
        num1 = num2; //30
        num2 = temp; //10
        System.out.println("num1 = " + num1); //30
        System.out.println("num2 = " + num2); //10

//        Reverse without loop:
//           index    0   1   2   3
        int[] nums = {5, 10 , 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0];     // 5 = 100
        nums[0] = nums[3];  // 5 = 100
        nums[3] = temp;     // 100 = 5
        System.out.println("After first and last swap: " + Arrays.toString(nums));
//        output: [100, 10, 4, 5]

//        Reverse with int loop:
        int[] nums2 = {5, 10 , 4, 100};
        System.out.println("Before: " + Arrays.toString(nums2));
        for(int i =0 ; i < nums2.length/2; i++) { //loop just half
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length-1-i];
            nums2[nums2.length-1-i] = temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));
//        output: After: [100, 4, 10, 5]

//        Reverse with String loop:
//            index          0      1      2      3       4
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
//        i -> 0, j -> 4                             2
        for(int i =0, j = words.length-1; i < words.length/2; i++, j--){ // i: go forward, j: go backward
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("After reverse words = " + Arrays.toString(words));
//        output: [css, ruby, js, html, java]
    }
}
