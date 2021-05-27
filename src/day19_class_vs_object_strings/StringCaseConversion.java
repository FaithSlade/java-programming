package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java Is Fun!";
        System.out.println(word);  // print CyberTek cause not convert yet
//        convert word to all lowercase
        System.out.println(word.toLowerCase());  // print cybertek
        System.out.println("JAVA".toLowerCase());  // print java
        System.out.println(sentence.toLowerCase());  // print 123 java is fun

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);
//      Change word to all lowercase letters and assign back
        word = word.toLowerCase();
//        This look like num = num + 5  it same idea
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());  //AMAZON
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase()); //JAVA

//Reassign: to change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);  //Amazon
        company = company.toUpperCase(); // Reassign to make it permanent
        System.out.println("company = " + company);
    }
}
