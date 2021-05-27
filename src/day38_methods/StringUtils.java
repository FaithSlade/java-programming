package day38_methods;

import java.util.Locale;
public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null; // will check with str
        //System.out.println(word.isEmpty());

//      System.out.println(word.toUpperCase());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(null));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));


    }

    public static boolean isNullOrEmpty(String str) {
//      return (str == "null" || str.isEmpty()); // it will print true/false right always
        if (str == null || str.isEmpty()) { //null have to come first
//     when this side is null after || will not run
//     when string is null, there is no string to run a method on
//     we can not do .isEmpty() then check the null -> ERROR
//     So in general you have to check null first everytime
            return true;
        } else { // we don't need else statement eventually
            return false;
        }
    }

    public static boolean isPalidrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        /*
        to check what time number behind (str.length() - 1 - i))
        debug mode -> highlight (str.length() - 1 - i)) -> right click -> add to watch
        it work only when you in the loop
        to remove watch: right click -> remove watch
         */
             return true;
    }

    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
