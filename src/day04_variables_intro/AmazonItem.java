package day04_variables_intro;

public class AmazonItem {
    public static void main (String[] args){
        String description = "HIC wooden spoon"; // String
        int ratingsCount = 181;
        Double price = 5.99;  // decimal point use Double
        String seller = "Amazon.com";
        boolean prime = true;
//        String prime = "yes"; // it's work

        System.out.println("--- PRODUCT INFORMATION ---" );
        System.out.println(description);
        System.out.print(" * * * * * ");
        System.out.println(ratingsCount);
        System.out.println(price);
        System.out.println(seller);
        System.out.print(prime);


    }

}
