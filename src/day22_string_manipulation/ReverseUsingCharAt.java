package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Java";
//        reverse "avaj"
        char num1 = word.charAt(0);
        char num2 = word.charAt(1);
        char num3 = word.charAt(2);
        char num4 = word.charAt(3);

        System.out.println(num4 + "" + num3 + "" + num2 + "" + num1);
//        OR
        System.out.println(word.charAt(3) +""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0));
// if we print -> word.charAt(3) + word.charAt(2)  result it asciitable as number
//        so we have to make it to string "" eventually one of "" is enough
// Ex:   System.out.println(""word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        String word2 = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not Palindrome word");
        }

    }
}
