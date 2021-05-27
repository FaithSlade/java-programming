package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        boolean isRemote, benefits;
        double salary = 120_000.0;
        String location = "Mountain View";
        isRemote = true; //to change name multi line -> right click -> refactor ->rename
        benefits = true;

        if (salary >= 120_000.0 && location.equals("Mountain View") && isRemote && benefits){
            System.out.println("Accept this offer");
        } else {
            System.out.println("Accept this offer");
        }
    }
}
