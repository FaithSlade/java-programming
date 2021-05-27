package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(5.8,8.9));
        System.out.println(sum(3,5,8));
        System.out.println(sum("Faith","Derek"));

    }
    public static int sum (int num1, int num2) {
      int result = num1 + num2;
      return result;
    }
    public static double sum (double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public static int sum (int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
    public static String sum (String num1, String num2) {
        String result = num1 + " " + num2;
        return result;
    }
}
