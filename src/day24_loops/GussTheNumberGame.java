package day24_loops;
import java.util.Scanner;//import java.util.Random;
public class GussTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = scan.nextInt();
        int guessingNumber; //0

        do {
            System.out.println("Guess the secret number");// first start check
            guessingNumber = scan.nextInt();  // type your secret number //first check
            if(guessingNumber > secretNumber) { //check true go statement below|false go to else if condition
                System.out.println("wrong, your number is too large");//if true go while
            }else if(guessingNumber < secretNumber){ ////check true go statement below|false go to else if condition
                System.out.println("wrong, your number is too small");//check either true or false will go check while statement
            }
        }while(secretNumber != guessingNumber);//check both number are match | either true or false will come to check here again
//        if not match do to : first start check "Guess the secret number"
//        if match go to print statement below
        System.out.println("Congratulations, you won! secret number: " + secretNumber);
    }
}

