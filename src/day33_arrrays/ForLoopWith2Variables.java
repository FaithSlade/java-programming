package day33_arrrays;

public class ForLoopWith2Variables {
    public static void main(String[] args) {

        for(int i =1, j =1; i<= 4; i++, j++){
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("------------- 2 way for loop--------------");
        for(int i =1, j =5; j>=0; i++, j--){ // it not nested loop
  //condition can be anything or can do two or more condition by use &&, ||
//  the variable you can have more than two too
//  When condition is false will exit the loop
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
