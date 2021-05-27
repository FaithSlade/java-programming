package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num += 10;
        System.out.println(num);

//    There are 2 ways to create Integer
//    first ways:
        Integer n = new Integer(500);// you can do "500" too
        System.out.println("is n 500? = " + n.equals(500));// convert : int to Integer -> become object now
        System.out.println(n + 300);

//    Second ways:
        Integer intObject = 1000;// do it directly
        System.out.println(intObject/50);
//        convert intObject to String
        String numStr = intObject + ""; // +"" to make int to String
        String numSt = intObject.toString();//toString method takes the object and converts it to a String type.

        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);

        /**
         * DECLARING AND INITIALIZING WRAPPER CLASSES:
         *
         */

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short)40);
        Short sh2 = 50;

        Integer i1 = new Integer((int)100);
        Integer i2 = 200;

        Long l1 = new Long(300L);
        Long l2 = 3455L;

        Float fl1 = new Float(5.2F);
        Float fl2 = 45.3F;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 = new Character('Q');
        Character ch2 = 'V';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

    }
}
