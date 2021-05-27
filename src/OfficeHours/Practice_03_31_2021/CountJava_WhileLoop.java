package OfficeHours.Practice_03_31_2021;

/**
 * How many java word in String
 */
public class CountJava_WhileLoop {  // While loop is infinite loop but it base on boolean
    public static void main(String[] args) {

        String str = "java is fun. java class today, not javascript";
        int count = 0;

        while(str.contains("java")) {
            count++;
            str = str.replaceFirst("java", "");  // replaceFirst mean replace just the first time
        }

        System.out.println("Java was found " + count + " times");
    }
}
