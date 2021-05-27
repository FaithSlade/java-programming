package day33_arrrays;

import java.util.Arrays;
public class SplitReview {
    public static void main(String[] args) {
//don't use this approach to count it doesn't work all the time
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length); //2 there are 2 of "a"
        int countOfA = array.length-1; //by looking length we know how many "a" is here
        if(word.endsWith("a")) {
   //if it end with "a", add one more in count sentence below but if have "a" at beginning is fine
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

//        we you split String with "" empty it will give you separate character
        System.out.println("--------SPLIT WITH EMPTY STRING---------");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(Arrays.toString(strArr));

        String word2 = "java1sql2html";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
