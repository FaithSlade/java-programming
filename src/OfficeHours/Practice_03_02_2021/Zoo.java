package OfficeHours.Practice_03_02_2021;

/*
Make a class Zoo
make a main method
Create variables and give some values
- For this one, pick which datatype you think is best for each variable
- name, founded date, starting time, closing time, open on holidays, has aquarium section, number of big cats, number of hoofed animals, number of reptiles, number of birds, number of primates, number of employees, ticket cost for adults, ticket cost for under 13, park rules,
- Make a brochure of the zoo's information.
 */
public class Zoo {
    public static void main(String[] args){
        String name = "Zoo", foundedDate = "March 3, 2021", startTime = "7.0",
                closingTime = "5:00PM";
        boolean isOpenOnHolidays = true, hasAquarium = false;
        byte numberOfBigCats = 10, numberOfHoofedAnimals = 100, numberOfReptiles =20,
                numberOfPrimates = 20;
        int numberOfEmployees = 300;
        double ticketCostForAdults = 50.50, ticketCostForUnder13 = 25.50;
        String parkRules = "Do not bring food outside, " + "Do not feed animals";

        System.out.println("        ****** ZOO INFORMATION ******");
        System.out.println("Founded date : \t\t\t\t\t" + foundedDate);
        System.out.println("Start time : \t\t\t\t\t" + startTime);
        System.out.println("Closing time : \t\t\t\t\t" + closingTime);
        System.out.println("Holidays open : \t\t\t\t" + isOpenOnHolidays);
        System.out.println("Has Aquarium : \t\t\t\t\t" + hasAquarium);
        System.out.println("Number of big cats : \t\t\t" + numberOfBigCats);
        System.out.println("Number of hoofed animals : \t\t" + numberOfHoofedAnimals);
        System.out.println("Number of reptiles : \t\t\t" + numberOfReptiles);
        System.out.println("Number of primates : \t\t\t" + numberOfPrimates);
        System.out.println("Number of employees : \t\t\t" + numberOfEmployees);
        System.out.println("Ticket cost for adults : \t\t" + ticketCostForAdults);
        System.out.println("Ticket cost for under13 : \t\t" + ticketCostForUnder13);
        System.out.println("Park rules : \t\t\t\t\t" + parkRules);










    }
}
