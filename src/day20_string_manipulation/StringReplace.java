package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentence = "java string are fan";
        System.out.println(sentence);  //java string are fan
        System.out.println(sentence.replace("a","u")); //juvu string ure fun
//        to print "java condition are fun"
        System.out.println(sentence.replace("string","condition"));  //java condition are fun
//        to remove java
        System.out.println(sentence.replace("java",""));  //string are fun
    }
}
