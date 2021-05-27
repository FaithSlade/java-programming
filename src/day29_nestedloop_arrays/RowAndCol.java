package day29_nestedloop_arrays;

import com.sun.javaws.IconUtil;

public class RowAndCol {
    public static void main(String[] args) {

        for(int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print(row + " | " + col + "  \t");
            }
            System.out.println();
        }
    }
}
