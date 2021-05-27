package replit.Arrays;

/**
 * An array inhabitants represents cities and their respective populations.
 * For example, the following arrays shows 8 cities and their respective populations:
 * [3, 6, 0, 4, 3, 2, 7, 0]
 * [3, 6, 0, 4, 3, 2, 7, 0]
 * Some cities have a population of 0 due to a pandemic zombie disease
 * that is wiping out the human lives. After each day, any city that is adjacent
 * to a zombie-ridden city will lose half of its population
 * (City that has a 0 population).
 *
 * Write a program to loop though each city population and
 * make it lose half of its population if it is adjacent(right or left)
 * to a city with zero people until all cities have no humans are left.
 *
 * Make updates to each element in the array And print the array like below
 * for each day:
 *
 * Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
 * Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
 * Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
 * Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
 * Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
 * Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
 * ---- EXTINCT ----
 * Write the program in a way that it will handle any number of people in cities,
 * above was just an example.
 */
import java.util.*;
public class Zombie_Attack_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        //created empty Array with the same size as given array to compare with, so while loop will have the end condition
        int[] emptyArray = new int[inhabitants.length];

        //created temporary empty array to temporarly store the changed values of given array, so the value of given array will not be divided by 2 two times. In case 0 is before and after the value.
        int[] tempArray = new int[inhabitants.length];

        //index is created to increase the number of days
        int index=1;
        while(!Arrays.equals(inhabitants, emptyArray)) {
            for(int i=0; i<inhabitants.length; i++){

                //to be able to check and store in tempArray the first and last index values, added if statements for first and last indexes
                if(i==0 && inhabitants[i+1]!=0){
                    tempArray[i]=inhabitants[i];
                }else if(i==0 && inhabitants[i+1]==0){
                    tempArray[i]=inhabitants[i]/2;
                }else if(i==inhabitants.length-1 && inhabitants[i-1]!=0){
                    tempArray[i]=inhabitants[i];
                }else if(i==inhabitants.length-1 && inhabitants[i-1]==0){
                    tempArray[i]=inhabitants[i]/2;
                }else if(inhabitants[i-1]==0 || inhabitants[i+1]==0){
                    tempArray[i]=inhabitants[i]/2;
                }else{
                    tempArray[i]=inhabitants[i];
                }
            }

            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i]=tempArray[i];
            }
            System.out.println("Day " + index+" "+Arrays.toString(inhabitants));
            index++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
