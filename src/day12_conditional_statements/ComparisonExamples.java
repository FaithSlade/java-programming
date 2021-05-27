package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        double currentSpeed = 45;
        double speedLimit = 55;
        System.out.println(currentSpeed > speedLimit);  //false
        System.out.println(speedLimit < currentSpeed);  //false  
        System.out.println(currentSpeed == speedLimit);  //false
        
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);  //false
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        speedLimit += 20;  //45+20 -> 65  adding
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);  //false
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println(accountBalance >= itemPrice);  //true
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));  //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford = " + canAfford);  //true

        // decrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? = " + isBroke);  //false
    }
}
