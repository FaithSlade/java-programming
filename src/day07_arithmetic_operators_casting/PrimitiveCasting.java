package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args){
        int num1 = 100;
        byte b1 = (byte)num1;  //covert cause byte smaller than int
        short shNum = (short)num1;
        long lNum1 = num1;

        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum);
        System.out.println(lNum1);

    }
}
