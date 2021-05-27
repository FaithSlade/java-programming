package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args){
        int years = 2020;
        if (years == 2020) {
            System.out.println("Covid19 pandemic years");
            System.out.println("Wear mask and keep distance");
        }
        // skips else
        System.out.println("Keep coding java");

        String country = "USA";
        if(country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ave");
        }
        System.out.println("Welcome to " + country);
    }
}
