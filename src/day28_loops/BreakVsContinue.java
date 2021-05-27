package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        //BREAK STATEMENT
        for (int n = 1; n <= 5; n++) {
            System.out.print(n);
            if (n == 3) {
                break; //it work only inside loop cannot do it outside ERROR
//                output: 123
            }
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) { // skip 2 and 4
                continue; // goto next iteration. skip the code below
            }
                System.out.print(i); //still in for loop don't forget
//            output: 135
        }
    }
}