package OfficeHours.Practice_03_09_2021;
import java.util.Scanner;
public class SecondsConvertor {
    public static void main(String[] args){

        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();  //3695
        /*
            60 sec = 1 minutes
            60 min = 1 hours
            60 * 60 = 3600 sec in hours
         */
        hours = inputSeconds / 3600;  //3695/3600 -> output is hr
//        inputSeconds % 3600 -> remainder is 95 sec
        inputSeconds = inputSeconds % 3600; // declared new value of remainder
//        inputSeconds %= 3600; -> it same idea at line above (we just use shorthand operator)
        minutes = inputSeconds / 60;  //95/60 = 1 min left
        inputSeconds %= 60;  //35 sec
        seconds = inputSeconds;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
