package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
//        void cannot do any action, no if-else, no print out and no return value
        loginVoid("cybertekStudent", "abc1234");//Positive TEST| SUNDAY DAY
        loginVoid("cybertek", "answer"); //NEGATIVE TEST| RAINY DAY SCENARIO
        login("", " ");
//        System.out.println(loginVoid("cybertekStudent", "abc1234"));  ERROR because it void method

        System.out.println(login("cybertekStudent", "abc123"));
        if(login("cybertekStudent", "abc123")) {
            System.out.println("Longin successful, welcome to Canvas");
            System.out.println("Select the course to continue");
        } else {
            System.out.println("Login failed");
        }
//       data type need to matching : boolean
//        |                        |
        boolean isLoginSuccess = login("Nadir", "Mountain");
        System.out.println("is longinSuccess = " + isLoginSuccess); //false

        if(login("Nadir", "Mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }
        // String ret = System.out.println("hello"); ERROR. it is void
    }

    public static void loginVoid(String userName, String password) {
///you can use scanner but pls use it in main method
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword) ) {
            System.out.println("Login successful, welcome CybertekStudent!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
    //-----------------------------------------------------------------------------
    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
//  1)    return userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);

//        or

//  2)    if(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
//            return true;
//        } else {
//            return false;
//        }
//    }    or

//  3)
        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true; //return true, and exit method here. return false will not run
        }
            return false;
        }
    }
