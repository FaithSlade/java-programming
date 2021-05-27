package OfficeHours.Practice_03_31_2021;

public class CountJava_forLoop {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;

        // str.substring(0,4) keep counting and check every 4 character cause java 0123
        // str.substring(1,5)
        // str.substring(2,6)

        for(int i=0; i < str.length()-3; i++) {

            String eachFourLetters = str.substring(i, i+4);
            if(eachFourLetters.equals("java")) { //you can use contains() too it work
                count++;
            }
            System.out.println(eachFourLetters);

        }

        System.out.println(count);
    }
}
