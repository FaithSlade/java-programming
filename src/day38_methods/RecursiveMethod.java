package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(1);//it will print the number until it max of the computer memory
//        and it depend on the started point : printNums(1) can change the number

        //main(null); //cause it string[] args -> to call itself
    }
    public static void printNums(int num) {
        System.out.println(num + " ");
        num++;
        if (num <= 100) {
            printNums(num);
        }
    }
}
