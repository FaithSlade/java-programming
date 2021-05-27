package day18_condition_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String carBrand = "Audi";
        String model = "SQ5";
        double leasePrice = 0.0;

        if (carBrand.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
             }
        } else if (carBrand.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 552.0;
            } else if (model.equals("A3")) {
                leasePrice = 412.0;
            }
        } else {
            System.out.println("Invalid make");
            return; //exit program/ exit main method
        }
        System.out.println("Car brand: " + carBrand);
        System.out.println("Model: " + model);
        System.out.println("Lease price: " + leasePrice);
    }
}
