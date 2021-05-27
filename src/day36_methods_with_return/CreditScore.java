package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
//        -----------------Void Method : Not Return Value---------------------
        checkEligible(750);
        checkEligible(850);
        checkEligible(450);
//      System.out.println(checkEligible(711)); -> ERROR cannot print void method

//        -----------------Return Method----------------------
        System.out.println(getCreditScore()); // it will return 800 and print out for us
        System.out.println("Score = " + getCreditScore());
        getCreditScore(); // you can do it NO ERROR but it not print anything
        int score = getCreditScore(); // returning value store by assigned to score
        System.out.println("score = " + score);
    }

//        -----------------Void Method : Not Return Value---------------------
    public static void checkEligible (int creditScore){
        if (creditScore >= 700){
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry, You are not eligible for leasing this car");
        }
    }
    //        -----------------Return Method----------------------
    // when type int in this statement below it will show red cause it waiting us to type the return;
    public static int getCreditScore(){
        return 800;
    }
}
