package day40_arrayList;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();// you can type ArrayList<String> too
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then goto mall");
        }
        shoppingList.add("louis vuitton");
        shoppingList.add("Chanel");
        shoppingList.add("Dior");
        shoppingList.add("Fendi");
        shoppingList.add("Cartier");
        shoppingList.add("Rolex");
        shoppingList.add("Gucci");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then goto mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is Rolex in my list - " + shoppingList.contains("Rolex"));
        if(shoppingList.contains("Rolex")){
            System.out.println("Rolex is in the list");
        } else {
            System.out.println("Rolex is not in the list");
        }

        System.out.println("Buying Rolex $30,000");
        shoppingList.remove("Rolex");//remove return boolean in this case
        System.out.println(shoppingList);//[louis vuitton, Chanel, Dior, Fendi, Cartier, Gucci]

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();//clear the list, remove all items: cannot print it
        System.out.println(shoppingList);//[] empty
    }
}
