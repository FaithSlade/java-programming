package day40_arrayList;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {
//        Declare raw arraylist 2 ways
        ArrayList list1 = new ArrayList();//import java.util.ArrayList; or *
        List list2 = new ArrayList(); // need to import java.util.List; or *

//default_capacity of ArrayList = 10 when we declare

//        add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println("list1 = " + list1);
//  output: mix| allow all data type b/c it Raw/general type : you don't have control java not recommend
// list1 = [java, apples, coffee, 1234, 55.2, true, wooden spoon]

        System.out.println("size " + list1.size());//7
    }
}
