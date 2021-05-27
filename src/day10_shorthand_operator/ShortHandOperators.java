package day10_shorthand_operator;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);  //10
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);  //12
        cars += 5;
        System.out.println("cars in parking lot = " + cars);  //17

//        6 cars left the parking lot
//        cars = cars - 6;
//        System.out.println("cars in parking lot = " + cars);  //11
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);  //11

        cars = cars - 1;
        cars -= 1;
        System.out.println("cars in parking lot = " + cars);  //9 we declare it twice

        int electricCars = 13;
//        cars = cars + electricCars;
//        System.out.println("cars in parking lot = " + cars);  //22
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);  //22

        String word = "Java";  // it concatenating not adding cause it string
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word = " + word);
//        add " is fun "
        word += " is fun ";
        System.out.println("word = " + word);
        String selenium = " but \"selenium\" is more fun";
        word += selenium; // concatenate
        System.out.println("word = " + word);
//        word = Javaprogramming is fun  but "selenium" is more fun

        word += 12345;  //add 12345 to word become string even it a number
        System.out.println("word = " + word);
//        word = Javaprogramming is fun  but "selenium" is more fun12345

        char letter = 'A';  //asciitable
        System.out.println("letter = " + letter);  //A
        letter += 3;
        System.out.println("letter = " + letter);  //D
//         add 1 to letter
        letter += 1;
        System.out.println("letter = " + letter);  //E

        double parkingFee = 7.50;
        System.out.println("normal parking Fee = " + parkingFee);  //7.5
//        early bird fee is 50 off
//        parkingFee parkingFee / 2;
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);  //3.75

//        weekend parking is free
        parkingFee -= parkingFee;
        //parkingFee = parkingFee - parkingFee;
        System.out.println("weekend parking = " + parkingFee);  //0.0
    }
}
