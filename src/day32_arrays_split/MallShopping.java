package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
//              index         0         1       2         3         4            5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,    150.0,   9.99,      250.0 ,  439.50,      39.99};
        int[] itemIDs =   {12345 ,   12346,   12347,     12348,    12349,      12350};
//we cannot sort anything here it will ruin value price
// we cannot unsorted it too -> binary search cannot do it yet with out sorted first

        System.out.println("----------FIND THE INDEX OF 'Gloves' in items array----------");
//        use for loop with condition
        for (int i =0; i < items.length; i++){ // length is in the arrays so no ()
            if (items[i].equals("Gloves")){
                System.out.println("Gloves found at index " + i);
                break; //it will stop when the condition is true, exit for loop
//            System.out.println(i + " - " + items[i]); how to read item from array []
//                output: Gloves found at index 2
            }
        }
        System.out.println("--------Set boolean to true if first 'iPad' is found--------");
        boolean iPadExists = false;

        for(String item : items){ // all the items store in item.
            if(item.equalsIgnoreCase("iPad")){
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExisted = " + iPadExists); // print true
        if(iPadExists){
            System.out.println("We bought the iPad!!");
        } else {
            System.out.println("We forgot the iPad! :(");
        }
        System.out.println("-----Print the report of each shopping item-----");

        /**
         * shoes - $99.99 - #12345
         * .....
         * iphone 12 case - $39.99 - #12350
         *
         * it better to do normal for loop than for each
         */

        for(int i = 0 ; i < items.length; i++){
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i] );
        }

        System.out.println("------Look for 'Jacket' in items and print all details------");
        /*
        Jacket - $150.0 - #12346
         */
        for (int i =0; i < items.length; i++){
            if(items[i].equals("Jacket")){
                System.out.println("Index is " + i); // items[i]=jacket, i = 1 only number
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break; //stop searching after jacket is found
            }
        }
    }
}
