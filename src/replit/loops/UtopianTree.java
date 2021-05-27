package replit.loops;

/**
 * The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
 * Show 10 years of growth of the Utopian Tree.
 * Output:
 * year 1 - growth 1 cm
 * tree size: 1cm
 *
 * year 2 - growth 1 cm
 * tree size: 2cm
 *
 * year 3  - growth 1 cm
 * tree size:3cm
 *
 * year 4 - growth 2 cm
 * tree size: 5cm
 *
 * year 5 - growth 2 cm
 * tree size: 7cm
 *
 * year 6 - growth 2 cm
 * tree size: 9cm
 *
 * ... until you reach year 10
 */

public class UtopianTree {
    public static void main(String[] args) {

        int years = 1;
        int grow = 1;
        int cm = 1;

        while (years <= 10)
        {
            System.out.println("year " + years + " - growth " + grow + " cm");
            System.out.println("tree size: " + cm + "cm");
            years++;
            cm +=1;
            if (years >= 4 && years <=10){
                grow =2;
                cm +=1;

            }
        }
    }
}
