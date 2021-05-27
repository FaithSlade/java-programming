package replit.string;
/**
 * A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
 * Example:
 * input: breadjambread
 * output: jam
 */

import com.sun.codemodel.internal.JConditional;

import java.util.Scanner;
public class Get_Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        boolean oneBread = (first==last);

        if(oneBread){
            System.out.println("nothing");
        } else if (first >= 0 && last >= 0){
            System.out.println(str.substring(first+5,last));
        } else {
            System.out.println("nothing");
        }

        }
    }

