package replit.string;
/**
 * Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.
 * Ex:input: mike_tyson@gmail.com
 * output: tyson_mike@gmail.com
 */

import java.util.Scanner;
public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int start= email.indexOf("_");
        int stop= email.indexOf("@");

        if (email.contains("_")){
            String front = email.substring(0,start);
            String end = email.substring(start+1,stop);
            System.out.println(end + "_" + front + "@gmail.com");
        } else {
            System.out.println(email);
        }
    }
}
