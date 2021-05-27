package day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL : Username cannot be null or empty");
        }
        System.out.println("isPalidrome(civic) = " + StringUtils.isPalidrome("civic"));
        System.out.println("isPalidrome(kayak) = " + StringUtils.isPalidrome("kayak"));


/*       we have to: import static day38_methods.StringUtils.*;
                                        |            |       |
                                     package  .  Class name .*
        so you don't need to type class name, just only method name to type
                                                            |
*/
        System.out.println("isPalidrome(Cybertek) = " + isPalidrome("Cybertek"));

        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);//word = java
        System.out.println("revWord = " + revWord);//revWord = avaj
        System.out.println(StringUtils.reverse(word));//avaj
    }
}
