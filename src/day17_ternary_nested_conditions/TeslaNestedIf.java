package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
       int score = 0;

       if(score ==0) {
           score += 50;
       }
       if (score != 0) {
           score += 50;
       }
        System.out.println(score);
    }
}
