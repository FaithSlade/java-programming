package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();// 1st call : you call the method multiple time: if debug 1)
        displayMessage();// 2nd call : debug 3) back here
        displayMessage();// 3rd call

        for(int i = 1; i<=100; i++){
            System.out.print(i + " - ");
            displayMessage(); // it will print 100 time
//          output: 1 - Hello B22 Friends! -> 100 - Hello B22 Friends!
        }
    }
//    first custom reusable method
    public static void displayMessage() {//it cannot run by it self
        // and it can be anywhere top or bottom main method
        // but it can not be outside the class
        System.out.println("Hello B22 Friends!"); // be bug 2), 4).. will jump here
        //outside main methods - nothing to run
    }
}
