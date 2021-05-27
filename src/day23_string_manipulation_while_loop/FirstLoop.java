package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        if(i <= 5) {
            System.out.println(i); // print 1 just one time
        }
        i++;  // add 1 to i , if-else no more checking a condition

        while ( i <= 5) {
            System.out.println(i); // print 1 again and again ...and so on
//            to stop the program to run -> click red square to the left like debug
        i++; //it will run 1 2 3 4 and stop at 5 because the condition then
//            will exit the program
//            is the statement false it will not print
        }
    }
}
