package replit.string;
/**
 * Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
 * Example:
 * input: xHiX
 * output: Hi
 */

import java.util.Scanner;
public class With_Out_X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String change;
        if (word.startsWith("x") || word.startsWith("X") || word.endsWith("x") || word.endsWith("X")){
            change = word.replace("x","").replace("X","");
            System.out.println(""+change);
        } else {
            System.out.println(word);
        }

//        or
        boolean startsX=word.startsWith("x")||word.startsWith("X");
//        boolean endsX=word.endsWith("x")||word.endsWith("X");
//        if(startsX){
//            System.out.print(word.substring(1,word.length()));
//        }else if(endsX){
//            System.out.print(word.substring(0,word.length()-1));
//        }else{
//            System.out.print(word);
//        }
//
    }
}
