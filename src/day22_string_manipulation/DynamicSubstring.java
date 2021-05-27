package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";

        System.out.println(result.substring(13,18)); //12345
        System.out.println(result.substring(13)); //12345
        System.out.println(result.substring(12,13));  //:
        System.out.println(result.substring(13));

//        find the index of :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":"); //looking for index12
//        (result.substring(colonIndex))
//        +1 mean start from next character mean 12345
        System.out.println(result.substring(colonIndex+1));

//        now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":")+1));
//        eventually before +1 it will print :12345
//        I don't want : to print so,
//        I +1 that make it start from next character mean 12345

        /**
         * find indexOf [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         */
        String today = "I coded [wooden spoon] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(today.indexOf("[")+1, (today.indexOf("]"))));  //wooden spoon
//        or
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));  //wooden spoon

    }
}
