package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
//1-5
        for (int count = 1; count <=10; count++ ){
            System.out.print(count);
            sum += count;
        }
        System.out.println("sum = " + sum);
//      output:  12345678910sum = 15
    }
}
