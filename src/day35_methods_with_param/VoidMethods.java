package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printZtoA();
        displayUSFlag();


        for (int i =0; i < 10; i++){
            displayUSFlag();
        }
    }
    /**
     * method name: printAtoZ
     * desc: prints English alphabet in all uppercase
     */
    public static void printAtoZ() {
        char character = 'Z';
        for (char i = 'A'; i < character + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoA() {
        char character = 'Z';
        for (char i = character; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /**
     * method name: displayUSFlag
     * displays flag of USA
     */
    public static void displayUSFlag(){
        System.out.println("-------FLAG OF USA-------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}