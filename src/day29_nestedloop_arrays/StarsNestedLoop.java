package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print("* ");
            }
            System.out.println();  // goto new line
        }
//        second stars
//     OUTER : 1 - 10
//    INNER: 1 to OUTER
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
//  inner <= outer -> outer at the first time run is 1 not 10
//                but the outer will run until 10
                System.out.print("*");
            }
            System.out.println();
        }
//reverse
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}