package day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10,10));
        System.out.println(Calculator.subtract(20,10));
        System.out.println(Calculator.multiply(10,2));
        System.out.println(Calculator.divide(20,2));
//    it will take you to Calculator class by using debug -> step into
//    it will take to the body line that you call under custom method line NOT on custom method line
//    then it will take you to return; after return will comeback here on the line that you call
//    on debug then it will print it out of you (println)
//*it will not print first: it will take you to class that you call first -> then come back to print after

        double d1 = 234.3;
        double d2 = 321.5;
        double sum = Calculator.subtract(d1,d2);
        System.out.println("sum = " + sum);

    }
}
