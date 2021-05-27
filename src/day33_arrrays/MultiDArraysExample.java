package day33_arrrays;

import java.util.Arrays;
public class MultiDArraysExample {
    public static void main(String[] args) {

        String[][] users = new String[3][2];
        users[0][0] = "Derek";
        users[0][1] = "James";
        users[1][0] = "Faith";
        users[1][1] = "Slade";
        users[2][0] = "Pong";
        users[2][1] = "Pui";

        String[][] userData = {{"Derek", "James"} ,
                               {"Faith", "Slade"} ,
                               {"Pong", "Pui"}};

//      separate firstname and last name: by split
//      System.out.println(userData[0][0].split(" ")[0]);

        System.out.println(userData[0][0]);
        System.out.println(userData[0][1]);
        System.out.println(userData[1][0]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][0]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));
//        output: [[Derek, James], [Faith, Slade], [Pong, Pui]]
    }
}
