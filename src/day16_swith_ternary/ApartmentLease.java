package day16_swith_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENT ####");
        int numberOfBedroom = 2;
        double startingPrice = 0.0;

        switch (numberOfBedroom){
            case 0:  //condition
                startingPrice = 1454.0;
                System.out.println("Studio apartment selected");
                break;
            case 1:
                startingPrice = 1725.0;
                System.out.println("One bedroom apartment selected");
                break;
            case 2:
                startingPrice = 2899.0;
                System.out.println("Two bedroom apartment selected");
                break;
            default: //you can put anywhere you want! bottom or top or middle
                System.out.println("5 bedroom currently unavailable");
                break;  //optional here
//              return; mean Exit main method -> after this line will not print anymore
        }
           System.out.println("Starting price: $" + startingPrice);
    }
}
