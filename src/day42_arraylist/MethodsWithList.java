package day42_arraylist;
import java. util.*;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        sumIntegerList(Arrays.asList(2,3));
        System.out.println(sumIntegerList(Arrays.asList(2,3)));
    }
    public static int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }
}


