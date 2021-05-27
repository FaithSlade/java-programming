package day19_class_vs_object_strings;

public class StringLength {
    public static void main (String[] args) {
        String word = "java";
        System.out.println(word);  // print java
//        (word.length()); to checked how many character
        System.out.println(word.length());  // 4
        System.out.println("count: " + (word.length()));  //4
//        the statement above it print 4 cause length it return to int
//        length == int
        System.out.println("wooden spoon".length()); //13
//        the statement above we counting space too!!

        String firstName = "Faith";
        System.out.println(firstName + " - " + firstName.length());  //5

//     length         Faith  ->  5  -> store it in count variable
//       |              |        |
        int count = firstName.length();
        System.out.println("count = " + count);  //5

        /* IF STATEMENT:
        WHEN password ia at least 6 characters
        print: Valid amazon password
        ELSE
        print: pass too short
         */
        String password = "abc123";
        if (password.length() >= 6 ){
            System.out.println("Valid amazon password");  //print
        } else {
            System.out.println("pass too short");
        }
    }
}
