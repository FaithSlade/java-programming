package replit.Arrays;
/**
 Given an int array num of any length, print a new array of its first 2 elements.
 If the array is smaller than length 2, use whatever elements are present.
 Examples:
 input: 1, 2, 3
 output: [1, 2]
 */
import java.util.*;
public class Front_Price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
//        -----------------------------------

        int[] newNum = new int[2];
        if (size < 2){
            newNum = num;
        } else if(size >= 2){
            newNum[0] = num[0];
            newNum[1] = num[1];
        }
        System.out.println(Arrays.toString(newNum));
    }
}
