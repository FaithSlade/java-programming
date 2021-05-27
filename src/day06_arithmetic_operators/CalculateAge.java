package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args) {
        int yearOfBirth = 1990;
        int currentYear = 2021;
        int age = currentYear - yearOfBirth;

        System.out.println(age);
        System.out.println("You are " + age + " years old");

    }
}
