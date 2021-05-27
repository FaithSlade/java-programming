package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";  //count space too
        /**
         * 1) word.substring(startIndex, endIndex)
         * endIndex is not included
         */
        System.out.println(word.substring(0,4));  //java
        System.out.println(word.substring(0,7));  //java is
//        print is
        System.out.println(word.substring(5,7));  //is
        //print fun
        System.out.println(word.substring(8, 11));

        /**
         * 2) substring(startIndex) - it will read from start until end
         * java is fun
         */
        System.out.println(word.substring(8)); //fun
//        print is fun
        System.out.println(word.substring(5));  //is fun
    }
}