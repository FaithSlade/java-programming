package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList1 {
    public static void main(String[] args) {
        printStrList(new ArrayList(Arrays.asList("ab", "cd", "ef", "gh", "ij")));

        System.out.println();

        List<Integer> numList = Arrays.asList(10,20,30,40,50);
        System.out.println(sumIntegerList(numList));

        System.out.println(sumIntegerList(new ArrayList(Arrays.asList(1, 2, 3, 4, 5))));

    }

    public static void printStrList(List<String> str) {
        str.forEach(eachStr -> {
            System.out.print(eachStr + " ");
        });
    }

    public static int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (int each : list)
            sum += each;
        return sum;
    }
}
