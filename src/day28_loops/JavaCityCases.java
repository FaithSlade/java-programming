package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
//        stated +200 cases Monday-Sat, +500 cases Sunday
        int totalCases = 0;
        for (int day = 1; day <= 30; day++) {
            if (day % 7 == 0) { //sundays day 7 more cases, no remainder it true
                totalCases += 500;
            } else {
                totalCases += 200;
            }
            System.out.println("Day" + day + " | total cases: " + totalCases);
        }
        System.out.println("JavaCity 03/2021 Total Cases: " + totalCases);
    }
}