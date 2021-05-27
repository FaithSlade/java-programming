package day10_shorthand_operator;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);  //3
//        add|increase 2 more to count 
        count = count + 2;
        System.out.println("count = " + count);  //5
        
        int apples = 5;
        System.out.println("apples = " + apples);  //5
        apples = apples + 10;
        System.out.println("apples = " + apples);  //15
        apples = apples - 3;
        System.out.println("apples = " + apples);  //12
        
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);  //8
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);  //4
//        get another whole small pizza just for you -6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);  //10
        
        int players = 10;
        System.out.println("players = " + players);  //10
//        double the players to start the match
        players = players * 2;
        System.out.println("players = " + players);  //20
        
        int cents = 244;
        System.out.println("cents = " + cents);  //244
//        keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("cents = " + cents);  //44
                
    }
}
