package replit.string;
/**
 * Given a String txt print the value without the last letter
 * Ex: Input: foo
 *     Output:fo
 * Hint: Use substring() and length()
 */

import java.util.*;
public class String_No_End {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0,txt.length()-1));
    }
}
