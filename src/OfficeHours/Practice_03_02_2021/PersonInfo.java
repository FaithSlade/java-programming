package OfficeHours.Practice_03_02_2021;
//src -> new package called OfficeHours -> new package called
// Practice_03_02_2021

public class PersonInfo{
    public static void main(String[] args){
//        variables without any value
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

//        Assignment of data
        name = "Faith";
        age = 30;
        gender = 'F';
        student = true;
        numberOfSiblings = 3;
        favoriteNumber = 2L;
        numberOfSeasons= 4;
        birthDate = 20;
        year = 1990;
        fullBirthDate = "" + birthDate + "." + year; // "" with concatenate + make everything after it become String.
//        if you put "" empty space at behind
//        Ex: birthDate + year + "" -> java will calculate the number first cause it not string!
//        the answers of the output will be 2010 but you want the output to be 201990
        //  fullBirthDate = birthDate + year + "" ; // 2010 -> adds first then turns to String

//                       double     char
//       if  double a = birthDate + '.' + year; -> '.' will go to the ascii table translate to the number (46)
//        then it will calculate 20+46+1990
//        System.out.println(birthDate + '.' + year); // 2056
//        double + char -> not concatenate, it is addition
        favoriteQuote = "have a good mindset";

        System.out.println("Full birthdate : " + fullBirthDate);

    }
}
