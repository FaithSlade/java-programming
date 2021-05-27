package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
//  auto-boxing : primitive > wrapper class
        int num1 = 500;// covert int into object(wrapper class object)
        Integer num2 = num1;
        Integer num3 = 234;// 234 just primitive check by 234. and see that have something coming up

//  Un- boxing : object > primitive
        Double d1 = new Double(100.5);
        double d2 = d1;//convert Object into double
        double d3 = new Double(30.5);//unbox (new Double(100.5);) into double

//  Un- boxing in java happen in automatically
    }
}
