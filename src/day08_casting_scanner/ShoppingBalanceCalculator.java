package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args){
        double balance = 345.55;
        double price1 = 20.88, price2 = 89.99, price3 = 15;
        double remainingBalance = balance - (price1 + price2 + price3);

        System.out.println("Your initial balance : \t\t$" + balance);
        System.out.println("Your remaining balance : \t$" + remainingBalance);
//        System.out.println("Your remaining balance : \t$" + (balance - (price1 + price2 + price3) ));

        int balanceWithNoCents = (int)remainingBalance; //we casting it
        System.out.println("Your remaining balance without cents : $" + balanceWithNoCents);

//
    }
}
