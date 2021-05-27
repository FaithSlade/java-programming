package day16_swith_ternary;

public class TernaryIntro {
    public static void main(String[] args) {
        int score = 90;
//                            if         true    false
//                             |          |        |
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);
    }
}
