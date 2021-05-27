package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
// Debug: if click on "Step over" it will take you to next line and print the code
// Debug: if click on "Step into" it will take you to the body line/println in custom name and print
    }

    public static void seatInCar() {
        System.out.println("1. Open the door and seat in driver seat");
    }
    public static void startTheCar() {
        System.out.println("2. Insert kry to ignition and turn clockwise");
    }
    public static void shiftToDrive() {
        System.out.println("3. Press brake pedal and shift to 'D'");
    }
    public static void pressGasPedal() {
        System.out.println("4. Hold Steering wheel with 2 hands and press gas pedal");
    }
}
