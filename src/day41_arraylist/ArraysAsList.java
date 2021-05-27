package day41_arraylist;

import javax.swing.plaf.basic.BasicListUI;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(28,31,1,89,67); //this one come from arrays class
        System.out.println("nums = " + nums);

        //nums.add(100); not work UnsupportedOperationException
        //nums.remove(0); UnsupportedOperationException
        //nums.clear(); UnsupportedOperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
//      so we create ArrayList base on this asList
        numsList.add(33);
        numsList.add(56);
        System.out.println("numList = "+ numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);
        numsList.remove(numsList.indexOf(4));
        System.out.println("numsList = " + numsList);

/**
 List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
 int caffeineAmount = 0;
 monster , red bull, celsius:
 caffeineAmount = 150
 coffee, kambucha:
 caffeineAmount = 112
 tea, coke, pepsi, mdew:
 caffeineAmount = 35
 */
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster"
                ,"red bull", "coke", "pepsi","mdew", "kambucha", "celsius"));

        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for(String drink : drinksWithCaffeine) {
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink +" --> " +caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink +" --> " +caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink+" --> " +caffeineAmount);
            }
        }

        for(String drink : drinksWithCaffeine) {
            switch(drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " +caffeineAmount);
                    break;
            }
        }
        //Lambda Expressions ->: it similar with foreach
        // syntax :  ->
        drinksWithCaffeine.forEach(drink -> System.out.print(drink.toUpperCase() + " "));// do one thing

        drinksWithCaffeine.forEach(drink -> { // do more than one thing
            System.out.println("this is forEach block");
            System.out.println("drink = " + drink);
        });

        drinksWithCaffeine.forEach(each -> { // do more than one thing
            System.out.println("--------------------");
            System.out.println("each = " + each);
            System.out.println("--------------------");
        });
    }
}
