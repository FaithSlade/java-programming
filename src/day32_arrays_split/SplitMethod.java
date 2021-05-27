package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {

        //                0     1       2     3
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":"); // cannot use , or | instant of :
        System.out.println(Arrays.toString(wordsArray));//this line for print array one line without loop, need to at import
        System.out.println("length of array = " + wordsArray.length); //4

        for(String each : wordsArray){
            System.out.println(each);
        }

        /*
        Interview question: How many word in sentences
         */
            String sentence = "today I am coding java arrays";

            String[] sentenceArray = sentence.split(" ");
            System.out.println("first word: " + sentenceArray[0]);
            System.out.println("first word: " + sentence.split(" ")[0]);
//statement above split already give it as array so you can treat it as array same line

            System.out.println("Number of words in sentence = " + sentenceArray.length);

        for(int i = 0; i < sentenceArray.length; i++){ //you can do for each
            System.out.println(sentenceArray[i]);
            }
        }
    }

