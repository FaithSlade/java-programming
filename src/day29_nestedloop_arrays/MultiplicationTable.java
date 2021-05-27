package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {


        for (int i =1; i <= 12; i++){
            for (int k = 1; k <= 12; k++) {
                System.out.print(i + "*" + k + "=" +i*k+"\t");
            }
            System.out.println();
        }
    }
}
