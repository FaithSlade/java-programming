package day09_scannaer_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("We need calculate weekly pay");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = hourlyRate * 40;

        System.out.println("Weekly pay = " + weeklyRate);

        System.out.println("We need calculate monthly pay");
        double sumMonthlyPay = weeklyRate * 52 / 12;
        System.out.println("Month pay = " + sumMonthlyPay);

        System.out.println("We need calculate annual pay");
        double sumAnnualPay = sumMonthlyPay * 12;
        System.out.println("Annual pay = " + sumAnnualPay);
    }
}
