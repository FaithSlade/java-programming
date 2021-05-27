package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 3, '|'));
        System.out.println(repeatString("I can do it!", 10, '-'));

        System.out.println(repeatString1("java",3,'|'));
        System.out.println(repeatString1("hi",3,'~'));
    }
    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";
        for(int i = 1; i <= times; i++) {
            //take care of last delimiter:
            if(i == times) { //if last iteration
                retValue += word; //add only word by itself
            } else {
                retValue += word + delimiter; //add with delimiter
            }
        }
        return retValue;
    }

    public static String repeatString1(String word, int times, char delimiter) {
        String retValue = "";
        for(int i = 0; i <= times; i++) {
            if(i == times) {
                break;
            } else {
                retValue += word + delimiter;
            }
        }
        retValue = retValue.substring(0,retValue.length()-1);
        return retValue;
    }
}
