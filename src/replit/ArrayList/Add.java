package replit.ArrayList;

/**
 * We will be manipulating elements of an ArrayList by using List methods.
 * The first List method we will learn is .add()
 * The following code will take an ArrayList of Strings called strs and add "Hello" to it.
 * strs.add("Hello");
 * The syntax is:
 * arraylistvariable.add(data_to_add);
 * Add three names (any names) to the ArrayList called names.
 */
import java.util.ArrayList;
public class Add {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        // Your code here

        names.add("Faith");
        names.add("Derek");
        names.add("Simon");


        // Do not touch below
        System.out.println(names.size());
    }
}
