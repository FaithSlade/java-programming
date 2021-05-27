package day46_encapsulation;

import com.sun.tools.internal.xjc.model.Model;

import java.time.Year;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();

        //ERROR below, model and year are PRIVATE and cannot be accessed from a different class
        //car1.model = "Nissan Altima";
        //car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());//Nissan Altima => getModel it return type so call it for print

        car1.setYear(2020);
        System.out.println("car1 years = " + car1.getYear());

        car1.setMileage(40_000);
        System.out.println("car1 mileage = " + car1.getMileage());//40000 not print underscore

        System.out.println(car1.toString());
        //Car{model='Nissan Altima', year=2020, mileage=40000}
        System.out.println(car1);//automatically calls toSting method
        //Car{model='Nissan Altima', year=2020, mileage=40000}

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia TI AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}
