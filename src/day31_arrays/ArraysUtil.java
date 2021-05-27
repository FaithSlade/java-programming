package day31_arrays;
import java.util.Arrays;
import java.util.Collections;
public class ArraysUtil {
    public static void main (String[] args){
        int[] nums ={100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));// covert number/anything to String change only this line
//  output: [100, 5, 1, 7, 0, -4, 44, 33]

//        ********** sort nums ***********
        Arrays.sort(nums); // you don't need to assign back it change/rearrange you array value!
//      System.out.println(Arrays.sort(nums));  ERROR cause sort don't give you a value
        System.out.println(Arrays.toString(nums));
//  output:  [-4, 0, 1, 5, 7, 33, 44, 100]

        System.out.println("min value: " + nums[0]); //-4
        System.out.println("max value: " + nums[nums.length-1]);  //100

//        ********** sort nums reverse ***********
//     sort in reverse order but not work with primitive type
//     Arrays.sort(nums, Collection.reverseOrder());  -> it object type

       String[] words ={"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join("," , words)+"]"); //more fixable than toString
// output: [java,C#,C++,Kotlin,Python,Ruby,Assembly]

//sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
// output: [Assembly, C#, C++, Kotlin, Python, Ruby, java]

//sort word in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
// output: [java, Ruby, Python, Kotlin, C++, C#, Assembly]
    }
}
