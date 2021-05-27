package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
//      ---------------------INT Number--------------------------
        displayValue(5); // 5 will be assigned to num: cause int
        displayValue(94);// you can make it many time as you want

        int count = 55; // we can use variable oe number
        displayValue(count); //num=count

        greetByName("Derek");
        greetByName("100");//String number need "" still
//        or
        String name = "Faith";
        greetByName(name);
    }
//    (int num)-> this is dynamic
    public static void displayValue(int num){ // you don't have to assigned the value now, you assign when you called it
        System.out.println("value is " + num);
    }
    /**
     * ----------------------STRING-------------------------------
     * method name : greetByName
     * @parameter/input: String name
     * It priny
     */
    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }
}
