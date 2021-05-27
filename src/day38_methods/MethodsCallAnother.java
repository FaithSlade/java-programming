package day38_methods;

public class MethodsCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        start();
    }
    public static void start(){ //we can have parameter here too
        System.out.println("start");
        continues();
    }
    public static void continues() {
        System.out.println("continue");
        end();
    }
    public static void end() {
        System.out.println("end");
//      start(); it will run but some point it will be stackoverflow
    }
}
