package replit.loops;

/**
 * Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space
 */
public class Print_Even_From_80To20 {
    public static void main(String[] args) {
        int number = 80;
        while (number >= 20 && number <= 80)
        {
            System.out.print(number + " ");
            number -=2;
        }
    }
}
