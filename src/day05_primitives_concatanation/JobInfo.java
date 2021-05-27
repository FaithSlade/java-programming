package day05_primitives_concatanation;

public class JobInfo {
    public static void main (String[] args){
        String title = "Software Engineer In Test (Java SDET)";
        String company = "Google";
        String jobDescription = "Experience in Java, Selenium, Cucumber, JUnit";
        double salary = 120000.00; // int is ok too.
        byte yearsExp = 6;
        boolean hasBenefits = true;

        System.out.println("Job Title : \t\t\t" + title);
        System.out.println("Company name : \t\t\t" + company);
        System.out.println("Job description : \t\t" + jobDescription);
        System.out.println("Salary : \t\t\t\t$" + salary);
        System.out.println("Years of experience : \t" + yearsExp + "years");
        System.out.println("Has benefits : \t\t\t" + hasBenefits);

    }
}
