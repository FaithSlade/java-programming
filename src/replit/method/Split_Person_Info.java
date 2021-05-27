package replit.method;

/**
 * The method person has a string argument with this format:
 * "name,last name,age". Print out the person's information
 * Example:
 * person("jon,doe,30");
 * output:
 * person name: jon
 * last name: doe
 * age: 30
 * hint: use the split method to split the string to a string array
 * where there is a "," char
 */
import java.util.Scanner;
public class Split_Person_Info {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here

        String[] newInfo = info.split(",");
        System.out.println("person name: " + newInfo[0]);
        System.out.println("last name: " + newInfo[1]);
        System.out.println("age: " + newInfo[2]);

    }
}