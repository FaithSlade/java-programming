package day43_list_custum_classes;

public class Company {
    public static void main(String[] args) {
        Employee newEmployee1 = new Employee();
        newEmployee1.name = "Derek";
        newEmployee1.jobTitle = "Developer";
        newEmployee1.work();
        System.out.println(newEmployee1.name);
        System.out.println(newEmployee1.jobTitle);

        Employee newEmployee2 = new Employee();
        newEmployee2.name = "Simon";
        newEmployee2.jobTitle = "Full stack developer";
        newEmployee2.work();
        System.out.println(newEmployee2.name);
        System.out.println(newEmployee2.jobTitle);

        Employee newEmployee3 = new Employee();
        newEmployee3.name = "Faith";
        newEmployee3.jobTitle = "SDET";
        newEmployee3.work();
        System.out.println(newEmployee3.name);
        System.out.println(newEmployee3.jobTitle);
    }
}
