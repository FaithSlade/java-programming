package replit.Arrays;

/**
 * Write a program that will find out shortest words in the given string str.
 * If there are few words that are evenly short, print them all.
 * Use split method in order to split str string variable and create an array of strings.
 * Print array with Arrays.toString() method. Sort array before printing.
 * Hint: Split values by comma: split(", ");
 *
 * input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
 *
 * output: [cat, old, ray]
 */
import java.util.*;
public class Print_Shortest_Word2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below
        String [] newArr = str.split(", ");
        String newStr = "";
        int min = newArr[0].length();


        for(int i =0; i < newArr.length; i++){
            if(newArr[i].length() <= min) {
                min = newArr[i].length();
                // newStr += newArr[i] + ",";
            }
        }
        for(int i=0; i < newArr.length; i++){
            if(newArr[i].length() <= min) {
                newStr += newArr[i] + ",";
            }
        }
        String[] resultArr = newStr.split(",");
        Arrays.sort(resultArr);
        System.out.println(Arrays.toString(resultArr));
    }
}
