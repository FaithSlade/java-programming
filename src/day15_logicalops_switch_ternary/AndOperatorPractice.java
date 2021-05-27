package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale, freeShipping;
        String itemName;
        onSale = true;
        freeShipping = true;
        itemName = "books";
// if(onSale==true  && freeShipping==true) it work too but we don't need to do this!
        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }

        if (freeShipping && onSale && itemName.equals("books")) {
            System.out.println("Add to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }
    }
}
