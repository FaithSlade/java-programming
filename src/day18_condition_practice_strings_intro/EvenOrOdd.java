package day18_condition_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num =5;
//        System.out.println(num % 2);  // 2 + 2 + 0 no remainder
//        if (num % 2 == 0) -> have ==0 to check even/odd
// if num divisible by 2 and result no remainder == 0 |mean 0==0 even
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
