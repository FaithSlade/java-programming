package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);  //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false);  //false

//        you have to check left-right as always!
//        java have just two(left-right)

        System.out.println(10>5 && 1==1);  //true
        System.out.println(7>3 && 10<=8);  //false
        System.out.println(99<98.1 && 3>=2);  //false
        System.out.println(7<=4 && 9!=9);  //false

        int  apples = 10, orange = 5;
        boolean check = apples > 5 && orange >3;
        System.out.println("Check = " + check);

        if (apples > 6 && orange > 2) //true
        {
            System.out.println("I have enough apples and oranges");
        } else {
            System.out.println("I need to go to Walmart to buy some fruit");
        }
    }
}