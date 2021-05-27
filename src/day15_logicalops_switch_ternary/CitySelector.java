package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Walnut Creek";
//Alamo or Walnut Creek
        //         False                     True
        if (city.equals("Alamo") || city.equals("Walnut Creek")) {
            System.out.println("Willing to relocate to - " + city);  //true
        } else {
            System.out.println("I am not considering to move");
        }
        // if teacher Murodil or Saim it's a java class
        // otherwise it will be softskills class with Nadir
        String teacher = "Nadir";

        if (teacher.equals("Murodil")  || teacher.equals("Saim")){
            System.out.println("It ia a java class with: " + teacher);
        } else {
            System.out.println("Soft skill class with: " + teacher);  //print
        }

        teacher = "Murodil";
        if (teacher.equals("Murodil")  || teacher.equals("Saim")){
            System.out.println("It ia a java class with: " + teacher);  //print
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with: " + teacher);
        } else if (teacher.equals("Gurhan")) {
            System.out.println("Some class with: " + teacher);
        } else {
            System.out.println("Some other class: " + teacher);
        }

//   company - "Google", salary >= 100k
        String company = "Zoom";
        double salary = 120_000.0;

        if (company.equals("Google") || salary <= 90_000.0) {
            System.out.println("Accept the offer: " + company);
        } else {
            System.out.println("Not Accept the offer: " + company);  //print
        }
    }
}