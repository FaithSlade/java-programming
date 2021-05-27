package day16_swith_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String  size = "tall";
        double price = 0.0;
        int calories = 0;

        switch (size){
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println("Tall Cappuccino please");
                break;
            case "grade":
                price = 3.99;
                calories =120;
                System.out.println("Grande Cappuccino please");
                break;
            case "venti":
                price =4.29;
                calories = 150;
                System.out.println("Venti Cappuccino please");
                break;
            default:
                System.out.println("We don't serve that "+ size +" of Cappuccino");
                break;
        }
        System.out.println("Total price: " + price);
        System.out.println("You will consume " + calories + "cal of energy");
    }
}
