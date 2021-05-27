package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "today is java class and we are coding for loops";
//        i < word.length() you can not use <= cause
//        char 0 - 46  and length 1-47
//        *char not have 47 character that make it ERROR
        for (int i =0; i < word.length(); i++){  // i = char so always start with 0
            System.out.println(word.charAt(i));
        }

/**
 * Long way, without loop.
 * System.out.println(word.length());
 System.out.println(word.length());
 System.out.println(word.charAt(0));
 System.out.println(word.charAt(1));
 System.out.println(word.charAt(2));
 System.out.println(word.charAt(3));
 */
        String word1 = "java";
//        for (int i =3; i >= 0; i--) {
//            System.out.print(word1.charAt(i));
//        }
        /**
         * Do reverse character
         */
//        word1.length()-1 = -1 cause length number always over than charAt 1 number
//        -1 it will have the same last character that charAt can accept it
//                         |
        for (int i = word1.length()-1; i >= 0; i--) {
            System.out.print(word1.charAt(i));
        }
        }
}
