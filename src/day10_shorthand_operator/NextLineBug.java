package day10_shorthand_operator;
import java.util.Scanner;
public class NextLineBug {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter rent and month");
        double rent = scan.nextDouble();
        scan.nextLine();  //fix the bug. work around, add on top
        String month = scan.nextLine();
        System.out.println("Rent = $" + rent);
        System.out.println("Month = $" + month);
    }
}
