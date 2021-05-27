package day05_primitives_concatanation;

public class House {
    public static void main (String[] args){
        String houseType = "Single Home";
        byte numberOfBedrooms = 4;
        byte numberOfBathrooms = 3;
        byte numberOfKitchens = 1;
        boolean isThereABasement = false;
        boolean isThereAnAttic = false;
        boolean isThereAPool = false;
        boolean isTheHouseForSale = false;
        double costOfTheHouse = 1300000.00;
        int addressNumber = 8667;
        String address = "Fenwick Way"+","+"Dublin"+","+"California";
        int zipcode = 94568;
        boolean isAParkNearBy = true;
        char ratingOfSurroundingSchoolDistricts = '5';

        System.out.println("House Type : \t\t\t\t\t\t\t\t" + houseType);
        System.out.println("The number of bedrooms : \t\t\t\t\t" + numberOfBedrooms);
        System.out.println("The number of bathrooms : \t\t\t\t\t" + numberOfBathrooms);
        System.out.println("The number of kitchens : \t\t\t\t\t" + numberOfKitchens);
        System.out.println("Is there a basement? : \t\t\t\t\t\t" + isThereABasement);
        System.out.println("Is there an attic? : \t\t\t\t\t\t" + isThereAnAttic);
        System.out.println("Is there a pool? : \t\t\t\t\t\t\t" + isThereAPool);
        System.out.println("Is the house for sale? : \t\t\t\t\t" + isTheHouseForSale);
        System.out.println("Cost of the house : \t\t\t\t\t\t$" + costOfTheHouse);
        System.out.println("Address : \t\t\t\t\t\t\t\t\t" + addressNumber + " " + address);
        System.out.println("Zipcode : \t\t\t\t\t\t\t\t\t" + zipcode);
        System.out.println("Is a park near by? : \t\t\t\t\t\t" + isAParkNearBy);
        System.out.println("Rating of surrounding school districts : \t" + ratingOfSurroundingSchoolDistricts);


    }
}
