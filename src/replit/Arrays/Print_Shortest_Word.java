package replit.Arrays;

/**
 * Write a program that will print the shortest word in the given array str.
 * input: java, cable, red, vivid, remedy, grace
 * output: red
 */
import java.util.*;
public class Print_Shortest_Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above

        String num = str[0];
        for (String each : str){
            if(each.length() < num.length()){
                num = each;
            }
        }
        System.out.println(num);
    }
}
