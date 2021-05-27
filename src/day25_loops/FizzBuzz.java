package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int num =0; num <= 100; num++){  // write code 1-100
            if (num%3 == 0 && num%5 == 0){
                System.out.println("FizzBuzz");
            } else if (num%3 == 0){
                System.out.println("Fizz");
            } else if (num%3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("print" + num);
            }
        }
    }
}
