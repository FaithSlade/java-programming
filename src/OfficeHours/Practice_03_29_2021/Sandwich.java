package OfficeHours.Practice_03_29_2021;

/**
 * A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
 * Example:
 * input: breadjambread
 * output: jam
 */
public class Sandwich {
    public static void main(String[] args) {
        String str = "breadbread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)

        if(str.contains("bread")) { // 5,5
            int firstBread = str.indexOf("bread");

            if(str.substring(firstBread+5).contains("bread")) { //jambread
                int secondBread = str.lastIndexOf("bread");
                String result = str.substring(firstBread + 5,secondBread);

                if(result.isEmpty()) { //if between bread have nothing ""
                    System.out.println("nothing");
                } else {
                    System.out.println(result);
                }

            } else {
                System.out.println("nothing");
            }
        } else {
            System.out.println("nothing");
        }
    }
}
