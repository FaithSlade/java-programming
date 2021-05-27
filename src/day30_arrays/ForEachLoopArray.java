package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        System.out.println("------------ FOR EACH LOOP ------------");
//        index       0    1   2 ...
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
//       | matching data type : array variable name
    for(int eachNum : data){  //here we don't need boolean or increment/decrement
        System.out.println(eachNum);  //data[i] we don't need this anymore
        }

        for(int n : data){
            System.out.print(n + " ");
        }


        System.out.println("------------ FOR LOOP ------------");
//        repeat above with for loop
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]); // reading by index 0, 1, 2, 3, ....
        }

        //print last value in array using length - 1
        //     10 - 1 = 9
        System.out.println("last value: " + data[data.length - 1]);

//        loop array reverse
        //print all number backwards in same line  NO FOR EACH LOOP
        for(int idx = data.length - 1; idx >= 0; idx--) { //>= mean including index 0
            System.out.print(data[idx] + " ");
        }
    }
}
