package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "San Francisco";
//        if (weather == "sunny") <-- it works, not error, but avoid
        if (city.equals("San Francisco")) {
            System.out.println("It is San Fran");
        } else {
            System.out.println("It is Not San Fran");
        }
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("Lets go out and code java!");
        } else {
            System.out.println("Let's stay indoors, and code java!");
        }
    }
}
