package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args){
        String city = "San Francisco";
//        equals() method- CASE SENSITIVE
        System.out.println(city.equals("San Francisco"));  // true
        System.out.println(city.equals("san francisco"));  // false
//        when you say equals it compare each character one by one "San Francisco"
        System.out.println(city.equals("san francisco "));  // false cause have space behind

//        equalsIgnoreCase() method- CASE INSENSITIVE COMPARISON (only upper and lower case)
        String anotherString;
        System.out.println(city.equalsIgnoreCase("San Francisco")); //true
        System.out.println(city.equalsIgnoreCase("SAN FRANCISCO")); //true
        System.out.println(city.equalsIgnoreCase("SAN FRANciSCO")); //true
        System.out.println(city.equalsIgnoreCase("SAN FrrNCISCO")); //false
        System.out.println(city.equalsIgnoreCase("SANFRANCISCO"));  //false

        if(city.equals("SAN FRANCISCO")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false"); //print
        }

        if(city.equalsIgnoreCase("SAN FRANCISCO")) {
            System.out.println("equalsIgnoreCase() true");  //print
        }else {
            System.out.println("equalsIgnoreCase() false");
        }

    }
}
