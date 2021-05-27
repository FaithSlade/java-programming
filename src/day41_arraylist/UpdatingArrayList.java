package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");//index number come fist| before String
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        //jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars);
        System.out.println(myCars.toString());//prints all cars
        String allCarsIn1St = myCars.toString();//convert/save all cars in one String variable
        //String allCarsIn1St = myCars; cannot do this
        System.out.println("All Cars In 1St" + allCarsIn1St);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars.toString());  //internally uses toString

        //change 4 to Honda
        myCars.set(4,"Honda");
        System.out.println("change index 4 to = " + myCars.toString());

        /**
         * How would you do that if myCars was array:
         * myCars[4] = "Honda";
         *
         * String str = "java";
         * str.indexOf("v") ==> 2
         */
        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));

        int moskvichIndex = myCars.indexOf("moskvich"); //store it for using .set later
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvish to subaru
        myCars.set(moskvichIndex,"subaru");
        System.out.println("after set to subaru = " + myCars);

        //replace ford with trabant using single statement:
        //indexOf("ford), "trabant"
        myCars.set(myCars.indexOf("ford"),"trabant");
        System.out.println(myCars.toString());

        //lada -> bugatti
        /*
        if myCars contains "lada"
            find index of lada and set value to bugatti
        else
            print "lada is not found"
         */
        if(myCars.contains("lada")){
            System.out.println(myCars.set(myCars.indexOf("lada"),"bugatti"));
        }else{
            System.out.println("lada ia not found");
        }
        System.out.println("After set bugatti = " + myCars.toString());

        /**
         * lamborghini -> prius
         * toyota -> lexus
         * trabant -> audi
         */

        for (int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equalsIgnoreCase("lamborghini")){
                myCars.set(i,"prius");
            } else if (myCars.get(i).contains("toyota")){
                myCars.set(i,"lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");
            }
        }
        System.out.println(myCars);
        //In this last example: they give an index for you already
        //so you don't need to find index by use .set(myCars.indexOf("",""))
    }
}
