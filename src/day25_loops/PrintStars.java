package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 15; stars++) {
            System.out.print("\uD83c\uDF1F * ");
        }
//        or below no one used
//        for(int stars = 1;
//            stars <= 15;
//            stars++){
//            System.out.print("* ");

        System.out.println();// stars new line
        String myStars = "";
//        for loop: fill 5 stars to myStars variable
        for (int n = 1; n <= 15; n++) { // for n you can start with 0 or 1 result is the same
            myStars += "\uD83c\uDF1F ";
//   or cheap ways: myStars += "*";
        }
        System.out.println("myStars = " + myStars + " "); // we can use.trim() to remove space on both side
//        ==============================================================

        for (int stars = 0; stars <= 15; stars++) {
            System.out.println("\uD83C\uDF1F * ");
        }

        String myStars1 = "";
        //for loop: fill 5 stars to myStars variable.

        myStars1 += "* ";
        myStars1 += "* ";
        myStars1 += "* ";
        myStars1 += "* ";
        myStars1 += "* ";
        System.out.println("my stars1 = " + myStars1.trim()); //* * * * *

//      above and below they get the same result just one without loop and one with loop

        myStars1 = "";
        for (int i = 1; i <= 5; i++) {
            myStars1 += "* ";
        }
        System.out.println("my stars1 = " + myStars1.trim());
    }
}
