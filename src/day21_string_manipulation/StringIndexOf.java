package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "github project";
        System.out.println(word.indexOf("g")); //0
        System.out.println(word.indexOf("u")); //4
        System.out.println(word.indexOf("hub"));  //3 it will give you the first only
        System.out.println(word.indexOf("java")); // -1 cause it can not find
        System.out.println(word.indexOf("t")); //2 answer only first one read from left to right
    }
}
