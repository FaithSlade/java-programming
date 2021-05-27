package day09_scannaer_practice;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("###### Temperature Converter ######");
        System.out.println("Please enter temperature in Fahrenheit");
        double fahrenheit = scan.nextDouble();
        double convertToCelsius = (fahrenheit - 32) * 5/9;

        System.out.println(fahrenheit + " Fahrenheit is = " + convertToCelsius + " Celsius");

    }
}
