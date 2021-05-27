package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));  //true
        System.out.println(company.contains("ital"));  //true cause it somewhere in container
        System.out.println(company.contains("l o"));  //true
        System.out.println(company.contains("j"));  // false case sensitive

//        if company contains space, print "multiple words company name"
//    else "single word company name
        if (company.contains(" ")){
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
//        check if " | " is in etsyTitle

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");  //print
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "Faith";
//        check if firstName contains "F" and "t" at same time.
        if (firstName.contains("F") && firstName.contains("t")){
            System.out.println("First name ; " + firstName);
        } else {
            System.out.println("Invalid first name");
        }

        firstName = "Slade";
        if (firstName.contains("S") || firstName.contains("d")) {
            System.out.println("First name ; " + firstName); //print
        } else {
            System.out.println("Invalid first name");
        }

        String email = "faithwslade@gmail.com";
//        check if email contains "@" and ends with ".com"
        if (email.contains("@") && email.contains(".com")) {
            System.out.println("valid email");
        } else {
            System.out.println("Invalid email");
        }

//        case insensitive -> call method chaining
//                 covert       check d in there
//                    |               |
        if(email.toLowerCase().contains("d")) {
            System.out.println(email);  //print
        } else {
            System.out.println("email");
        }
    }
}
