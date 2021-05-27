package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main (String[] args){
        for (int minutes = 1; minutes <= 5; minutes++){
            System.out.println("\nminutes = " + minutes); // this print everytime it run loop
            for (int seconds = 1; seconds <= 60; seconds++){
                System.out.print(seconds + " ");
            }
        }
        //clock
//       in 5 minutes when have to put 4 cause  second will run up to 59 or 60
//                                  |
        for (int minutes = 0; minutes <= 4; minutes++){
            for (int seconds = 0; seconds <= 59; seconds++){
//                or
//        for (int seconds = 1; seconds <= 60; seconds++){
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}
