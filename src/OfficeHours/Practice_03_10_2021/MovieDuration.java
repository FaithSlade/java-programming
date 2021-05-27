package OfficeHours.Practice_03_10_2021;
/*
[Movie duration]

The length of the movie will determine how much it costs.
Use a Scanner object to read the input from the user for how long the movie is and print
out how much the movie will cost.
The length will be given as a decimal as hours.minutes
> 1.0 - 8.99
> 1.5 - 10.50
> 2.0 - 12.99
> 2.5 - 14.50
-> 3 or more - 15.99

 */
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // input = just object name you can call it anythings.
        System.out.println("Enter the length of the movie");
        double movieLength = input.nextDouble(); // input come from scanner object have to match!
        double price = 0;  //default number that we setting up
//     double price = 0; mean if every things never true/match just leave it 0
//        = assignment
//        == compare
        if (movieLength == 1){
            price = 8.99;
        }
        if (movieLength == 1.5){
            price = 10.50;
        }
        if (movieLength == 2){
            price = 12.99;
        }
        if (movieLength == 2.5){
            price = 14.50;
        }
        if (movieLength >= 3){
            price = 15.99;
        }
        
        if(movieLength <= 0) {
            System.out.println("Invalid length");
        } else {
            System.out.println("Price: " + price);
        }
        
    }
}
