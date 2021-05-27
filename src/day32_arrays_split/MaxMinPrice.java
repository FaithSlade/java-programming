package day32_arrays_split;

import java.util.Arrays; //Click on it + alt + enter

public class MaxMinPrice {
    public static void main(String[] args) {

//              index         0         1       2         3         4            5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

//        print array values as String, in same line, with no loop, need to import arrays
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        /*
        OUTPUT:
        [Shoes, Jacket, Gloves, Airpods, iPad, iphone 11 case]
        [99.99, 150.0, 9.99, 250.0, 439.5, 39.99]
        [12345, 12346, 12347, 12348, 12349, 12350]
         */

        System.out.println("----1) find and print details of most expensive item----");

        double maxPrice = prices[0]; //assume first price is max
        int indexOfMaxPrice = 0; //assume max price is at index 0

        for (int i = 0; i < prices.length; i++) { // we can start i at 1 too
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

        System.out.println("----2) find and print details of least expensive item----");
        for (int i = 0; i < prices.length; i++) { // we can start i at 1 too
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i; // print index 4
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] +" - #" +itemIDs[indexOfMaxPrice]);
    }
}
