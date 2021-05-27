package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
//                           0  1   2
        String sentence = "java is fun";
        String[] words = sentence.split(" "); // accept only String"" no char''
        System.out.println("1 st word =  " + words[0]);
        System.out.println("2 st word =  " + words[1]);
        System.out.println("3 st word =  " + words[2]);
//      System.out.println("4 st word =  " + words[3]);  it ok when you type, when run it outOfBound

        for(String w : words){
            System.out.println(w);
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] total = googleResult.split(" ");
        System.out.println(googleResult.substring(6,15));//1,810,000
        System.out.println(total[1]); //1,810,000
        System.out.println(total[3].substring(1,5)); //0.68
        System.out.println(total[3].replace("(","")); //0.68




    }
}
