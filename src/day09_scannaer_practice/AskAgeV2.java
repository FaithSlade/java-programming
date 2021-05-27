package day09_scannaer_practice;

import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();  // int age = 30;
        System.out.println(age + " - that's great age!");
    }
}
