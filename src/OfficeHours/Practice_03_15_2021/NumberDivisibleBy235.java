package OfficeHours.Practice_03_15_2021;
/*
       Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

           Ex:
           number = 65

           Output:
           65 is divisible by 2: false
           65 is divisible by 3: false
           65 is divisible by 5: true
        */
public class NumberDivisibleBy235 {
    public static void main(String[] args) {
        int number = 65;

        boolean divisible1 = number % 2 == 0;
        boolean divisible2 = number % 3 == 0;
        boolean divisible3 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + divisible1);
        System.out.println(number + " is divisible by 3: " + divisible2);
        System.out.println(number + " is divisible by 5: " + divisible3);
    }
}
