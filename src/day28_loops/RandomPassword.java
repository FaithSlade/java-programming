package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();//help generate random number
        String password = "";
//                          doesn't matter what number you putting here or length()
        for (int i = 1; i <= 8; i++) { //             |
//            System.out.println(random.nextInt(source.length()));  you will get random number 8 time print
            int index = random.nextInt(71); // random number 0-70 cause 71 not including then store in index
            System.out.print(source.charAt(index)); //search index on source
//            you can use source.substring(index,index+1) too same at charAt
//            add the char to password variable using +=
//            password = password + source.charAt(index); or statement below
            password += source.charAt(index);
//            |
//store password in here each time run A * s t u @ 4 _
        }
        System.out.println("\n Your password = " + password);
    }
}
