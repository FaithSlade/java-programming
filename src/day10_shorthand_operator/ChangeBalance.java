package day10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args){
        double balance = 1230.55;
        System.out.println("balance = " + balance);  //1230.55

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);  //22.5
//        decrease balance by baklava prices
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);  //1208.05

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after kenafe = " + balance);  //1163.6

//        second kenafa is 50% off. lets buy it
        kenafe = kenafe /2;
        System.out.println("kenafe = " + kenafe);  //22.225
//        buy it and decrease balance with kanefe price
        balance = balance - kenafe;
        System.out.println("balance after kenafe = " + balance);  //1141.375

        double plov = 7.99;
        System.out.println("plov = " + plov);  //7.99
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);  //1133.385

        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);  //3.0
//        buy 4 iceTea and decrease balance
        balance = balance - (iceTea * 4);
        System.out.println("balance after 4 iceTea = " + balance);  //1121.385

//      return baklava
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);  //1143.885
    }
}
