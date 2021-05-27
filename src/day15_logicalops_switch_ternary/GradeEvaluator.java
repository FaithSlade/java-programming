package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'F';

        if (grade == 'A'  || grade == 'B'  || grade == 'C') {
            System.out.println("You passed with grade: " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade: " + grade );
        } else if (grade == 'F') {
            System.out.println("Fail Grade: " + grade);
        } else {
            System.out.println("Invalid grade: Withdraw ");
        }
    }
}
