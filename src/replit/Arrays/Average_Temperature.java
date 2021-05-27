package replit.Arrays;

/**
 * Given an array temps with temperature values find and print the average value
 * Example:
 * input: 80 88 88 84 82 78 60 68
 * output: 78.5
 */
import java.util.*;
public class Average_Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps


        double middleTemp = 0.0;
        for (int i =0; i < temps.length; i++) {
            middleTemp += temps[i];
        }
        double average = middleTemp/temps.length;
        System.out.println(average);
            }
        }
