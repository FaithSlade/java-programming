package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }
//        index :          0   1    2    3   4   5
        String sentence = "I wrote 100 lines of code";
//        split by space, parse index 2 to int
        String[] newSentence = sentence.split(" ");
        int linesOfCode = Integer.parseInt(newSentence[2]);//[2] is index
        System.out.println("linesOfCode = " + linesOfCode);

    }
}
