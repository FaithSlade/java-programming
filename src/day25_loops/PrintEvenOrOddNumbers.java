package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even number 0 - 100: ");
       for (int even = 0; even <= 100; even++) {
           if (even % 2 == 0)
           System.out.print(even + " ");
       }

        System.out.println("\n Odd number 0 - 100: ");
       for (int k = 0; k <= 100; k++){
           if (k % 2 == 1)  // you can use k % 2 != 0  -> it odd too
           System.out.println(k + " ");
       }
    }
}
