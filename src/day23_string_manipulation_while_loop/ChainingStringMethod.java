package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethod {
    public static void main(String[] args) {
        String word = "wooden spoon";
//                           WOODEN SPOON     wooden spoon  count 12
//                                |                  |          |
        System.out.println(word.toUpperCase().toLowerCase().length()); //12

        String word1 = "woo den spo on";
//        remove spaces first then print everything uppercase
        System.out.println(word1.replace(" ","").toUpperCase()); //WOODENSPOON
        System.out.println("word1 = " + word1);// word1 = woo den spo on
        String word2 = word1.replace(" ","").toUpperCase();
        System.out.println("word2 = " + word2); //WOODENSPOON

//        selenium.findElement(By.id("hi")).click()
        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));

        String city1 = "kAbUl";
        // read 1st letter.makeUppercase  +  read 2nd till last.make lowercase
        System.out.println(city1.substring(0,1).toUpperCase() + city1.substring(1).toLowerCase());//Kabul

        String capitalized = city1.substring(0,1).toUpperCase() + city1.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);//capitalized = Kabul

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

    }
}
