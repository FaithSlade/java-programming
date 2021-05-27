package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("Reply = " + reply);
        
//        same as if statement
//        int hourlyRate = 50;
//        String reply;
        if(hourlyRate>45) {
            reply = "accept";
        } else {
            reply = "reject";
        }
        System.out.println("Reply = " + reply);
        
        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Murodil\\Saim" : "Nadir";
        System.out.println("teacher = " + teacher);
        
        boolean isEligibleToDrive = true;
//        String driving; "have DL, Can drive"
        String driving = (isEligibleToDrive) ? "have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
