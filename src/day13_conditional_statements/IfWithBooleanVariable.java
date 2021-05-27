package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            //if you declare variable by boolean already, you can just say isHungry only it work!
            System.out.print("I am hungry I will go get something to eat \n Then code java");
            System.out.println("");
        } else {
            System.out.println("I am not hungry, Let's keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = 200 >= price;  //200 is budget
        System.out.println("isAffordable = " + isAffordable);

        if (isAffordable) {
            System.out.println("I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, let's keep coding java");
        }

        boolean isRemoteJob = true;
//        if it not remoteJob print "Sorry I am not interested"
//        otherwise, print "Sure I am interested, what is the interview process?"
        if (!isRemoteJob) {
            //(isRemoteJob != true) or (isRemoteJob == false) -> it all the same
            System.out.println("Sorry, I am interested, what is the interview process?\"");
        } else {
            System.out.println("Sure, I am interested, what is the interview process?\"");
        }
    }
}