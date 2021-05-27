package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "samsung";
        String model = "note9";
        String color = "black";
        double price = 799.99;
        int storage = 540;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);

        //WITH MESSAGE
        System.out.println("Brand : \t\t" + brand);
        System.out.println("Model : \t\t" + model);
        System.out.println("Color : \t\t" + color);
        System.out.println("Price : \t\t$" + price);
        System.out.println("Storage : \t\t" + storage + "GB");
        System.out.println("Has camera : \t" + hasCamera);

    }

}
