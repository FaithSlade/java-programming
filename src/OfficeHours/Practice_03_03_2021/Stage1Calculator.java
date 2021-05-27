package OfficeHours.Practice_03_03_2021;
/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class Stage1Calculator {
    public static void main(String[] args){
        double numOne = 5.0;
        double numTwo = 10.0;

//     With variable : good things that you can reused it.
        double addition = numOne + numTwo;
        double subtraction = numOne - numTwo;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;

        System.out.println("Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + addition);
        //5.0 + 10.0 = 15.0
        System.out.println(numOne + " - " + numTwo + " = " + subtraction);
        //5.0 - 10.0 = -5.0
        System.out.println(numOne + " * " + numTwo + " = " + multiplication);
        //5.0 * 10.0 = 50.0
        System.out.println(numOne + " / " + numTwo + " = " + division);
        //5.0 / 10.0 = 0.5
        System.out.println(numOne + " % " + numTwo + " = " + remainder);
        //5.0 % 10.0 = 5.0

//        RULE FOR REMAINDER:
//         when you put the first number smaller number than the second number the result of
//         the remainder will be small number (first number)
//          Ex: 5.0 % 10.0 = 5.0  ->will be 5.0


//        With out the variable:
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
//        it will be the same output so you can do it two ways
//        5.0 + 10.0 = 15.0

    }
}
