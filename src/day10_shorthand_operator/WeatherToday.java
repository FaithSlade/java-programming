package day10_shorthand_operator;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //string weather = "sunny but cold"
        String weather = scan.nextLine();

        System.out.println( weather + " - is a nice day today!");

    }
}
