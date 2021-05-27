package replit.method;

/**
 * Implement the do_switch method
 * Switch the last element in an array with the first and return the array.
 *
 * Examples:
 * do_switch([1,2,3,4])
 * returns:[4,2,3,1]
 *
 * do_switch([7,2,3,5])
 * returns:[5,2,3,7]
 */
import java.util.Arrays;
import java.util.Scanner;
public class Switch_Elements {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};

        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch(int[] i) {

        int[] arr = new int[i.length];
            for (int j = 1; j < i.length-1; j++) {
               arr[j] = i[j];
            }
            arr[0] = i[i.length-1];
            arr[arr.length-1] = i[0];
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
