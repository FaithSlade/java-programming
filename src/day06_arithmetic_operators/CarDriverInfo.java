package day06_arithmetic_operators;

import com.sun.corba.se.impl.encoding.BufferManagerWrite;

public class CarDriverInfo {
    public static void main(String[] args){
//        String carModel;
//        carModel = "Audi S5";
        String carModel = "Audi S5";
        String  driverName = "Faith";
        String licenseNumber = "MSYNOT";
        short speed = 120;
        boolean automatic = true;
        char licenseClass = 'c';

        System.out.println("Car Model : \t\t" + carModel);
        System.out.println("Driver name : \t\t" + driverName);
        System.out.println("License number : \t" + licenseNumber);
        System.out.println("Speed : \t\t\t" + speed + "mph");
        System.out.println("Automatic : \t\t" + automatic);
        System.out.println("License class : \t" + licenseClass);


//        Audi S5 is car model.
        System.out.println(carModel + " is a model");

    }
}
