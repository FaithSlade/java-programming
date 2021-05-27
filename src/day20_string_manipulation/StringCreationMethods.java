package day20_string_manipulation;

/**
 * Below import statement is automatically added to each class by compiler
import all classes from java.lang package
lang mean language
import java.lang.*; -> it gray color, it mean unused import
 */
import java.lang.*;

/**
 * if we import java.util.Scanner; with import java.lang.*;
 * one of them will not need anymore cause Scanner it specific topic
 */
public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 = "potato";
        String word2 = new String("tomato"); // right click -> disable hint to remove original:
        String word3 = "";  // declare without say anything
        String word4 = new String();  // declare without say anything
//        "java".sout -> enter fot automatic println
        System.out.println("java");

        System.out.println(word1);
        System.out.println(word2);
    }
}
