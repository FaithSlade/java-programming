package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 90;
        String quality = "good";

        String result = (score>60) ? "pass" : "fail";
        int rating = (quality.equals("good")) ? 100 : 0;
        char grade = (score > 90) ? 'A' : 'B';
        String evenOdd = (score % 2 == 0) ? "even" : "odd";

        String isItGood = "good";
        System.out.println(isItGood.equals("good") ? 100 : 0);
//      if it true/false -> it will assign to println
//        we can do this ways

        System.out.println("Result: " + result);
        System.out.println("Rating: " + rating);
        System.out.println("Grade: " + grade);
        System.out.println("Even\\Odd: " + evenOdd);

    }
}
