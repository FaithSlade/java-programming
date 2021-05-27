package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist. option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC");//0
        cities.add("New York");//1
        cities.add("Chevy Chase");//2
        cities.add("San Francisco");//3
        cities.add("Salt Lake");//4
        //add Walnut creek to 0 index
        cities.add(0,"Walnut creek");
        //print all value in same line
        System.out.println(cities);
//output: [Walnut creek, Washington DC, New York, Chevy Chase, San Francisco, Salt Lake]

        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));//even we have 6 item
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));
        //print count of items in arraylist
        System.out.println("count of item =" + cities.size());//count of item =6

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        //for loop we need.size : foreach we don't need .size
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");

            System.out.println();
        for(String each : cities){
            System.out.print(each + " ");
        }
            System.out.println();
        //delete item from arraylist
            //1) remove using index. delete value at index 2
            cities.remove(2);
            //2) remove using object/value
            cities.remove("New York");
            System.out.println("after remove = " + cities);

            //delete/remove all values from list
            cities.clear();

            //make sure it is clear
            //1) print/spit it out
            System.out.println("cities = " + cities);

            //2) using isEmpty
            if(cities.isEmpty()){
                System.out.println("list is empty");
            }

            //3) check size() == 0
            if(cities.size() == 0){
                System.out.println("list is empty");
            }
        }
    }
}
