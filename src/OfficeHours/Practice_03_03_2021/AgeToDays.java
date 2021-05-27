package OfficeHours.Practice_03_03_2021;
/*
Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days
    - Use a base of 365 days in a year
    - Calculate and display:
        You are $age years old! That means you are $days days old
 */

public class AgeToDays{
        public static void main(String[] args){
        int age = 30;
        int daysInAYear = 365;
        int ageInDays =  daysInAYear * age;

//        You should make your code Dynamic mean flexible
//        Hard code mean fix code "You can not changed it or static"
        System.out.println("You are " + age + " years old! That " +
                "means you are " + ageInDays + " days old");
// You are 30 years old! That means you are 10950 days old

        }
}

