package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
//  ---------------------String-------------------------
        fullName();// "Mike Smith" : eventually this line will not print anything
//      but we have println inside the custom method that why it print/ return value this time

//                                         "Mike Smith"
        System.out.println("full name : " + fullName()); // it will print whatever have in custom method first then comeback here and print println
        System.out.println("isMarried : " + isMarried());
        System.out.println("age : " +getAge());
        System.out.println("Birth year : " + getRandomYear());//dynamic. different year each time
//        output:
//        inside fullName method
//        inside fullName method
//        full name : Mike Smith

// -----------------------Store in Variable-------------------------
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int years = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("years = " + years);

    }

//  ---------------------String-------------------------
    public static String fullName(){
        System.out.println("inside fullName method"); //but you can have println before return; and it will print normal
        return "Mike Smith";
//      System.out.println("Mike Smith"); we cannot have println after return;
//      cause return it mean exit the method after return;
    }

//  ---------------------boolean-------------------------
    public static boolean isMarried() {
        return false;
    }

//  ---------------------int-------------------------
    public static int getAge() {
        int age = 35;
        return age; //return 35 same thing
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
