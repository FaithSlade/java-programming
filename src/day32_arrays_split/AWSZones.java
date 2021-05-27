package day32_arrays_split;

import java.util.Arrays;
public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("---------- Starting deplyment of etsy app to AWS zones ----------");
        String[] zoneToDeploy = zones.split(",");
        System.out.println(Arrays.toString(zoneToDeploy));

        for(String eachZone : zoneToDeploy){
            System.out.println("Deploying ["+app+"] to "+eachZone+".....");
        }
    }
}
