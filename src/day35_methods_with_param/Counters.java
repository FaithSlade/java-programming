package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(8);

        int num2 = 999; // make variable it work too
        count(num2);// method name (parameters/input name)
//        the variable her doesn't need to be same at parameters/input down there
//        num2 it work if it not same (int num)


        String word = "wooden spoon";// length 12
        count(word.length()); //this 12 will be assigned to (parameters num)
//        even it String but the length is int number so it will assigned to (int num)
//        it ok cause int and int together

        printAge(1990);
        int birthYear = 2001;
        printAge(birthYear);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {// i <= 10
            System.out.print(i + " ");
        }
        System.out.println();
        // output: 0 1 2 3 4 5 6 7 8 9 10
//         output: 0 1 2 3 4 5 6 7 8
    }
    /**
     * method name: printAge
     *@param/input: int year
     *"Birth year: 1984. Age: 38"
     */
    public static void printAge(int year){
        int thisYears = 2021;
        int countAge = thisYears - year;
        System.out.println("I am " + countAge +" years old");
    }
}