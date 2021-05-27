package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 100;

        do{
            System.out.println("counter = "+ counter);  // print 1 at first run without check condition
//            if condition false it still print statement above
//            false: output is counter = 100 and Exit
            counter++; // first time check 1
        } while (counter <= 10); //first time check as 2 cause above is counter++
        //use ; in stand of {}

//        if want to print every 5
        int counter1 = 0;
        do {
            System.out.println("counter = "+ counter);
            counter1 += 100;
        } while (counter1 <= 10);
    }
}
