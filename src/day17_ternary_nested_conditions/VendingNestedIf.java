package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {
                System.out.println("Drink option is selected");
                if (drinkItem.equals("tea")) {
                    System.out.println("Tea item is selected");
                } else {
                    System.out.println("Coke item is selected");
                }
        } else if (selection.equals("snack")){
                System.out.println("Snack option is selected");
                if (snackItem.equals("chips")) {
                    System.out.println("Chips option is selected");
                } else {
                    System.out.println("Candy option is selected");
                }
        }
    }
}
