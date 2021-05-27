package day25_loops;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Start Number: ");
        int start = scan.nextInt();
        System.out.println("Please Enter End Number: ");
        int end = scan.nextInt();
//            you can use variable or number
//                    |          |
        for (int i = start; i <= end; i++) {
            if (start < end) // start > end
                System.out.print(i + " "); //3 4 5 6
        }
            System.out.println("");
            System.out.println("Reverse numbering is not supported");// print when start more than end
        }
    }
