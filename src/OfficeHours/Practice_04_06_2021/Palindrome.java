package OfficeHours.Practice_04_06_2021;

/**
 * A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome. Print false if the word is not palindrome.->
 * input: civic->      output: true->
 * input: java->       output: false
 */
public class Palindrome {
    public static void main(String[] args) {

        String word = "anna";
        boolean isPalindrome = true; //first and last character match = true

//        even or odd it doesn't matter for Palindrome -> anna/civic
        // Q: What if your String has a million characters
        for (int i =0; i < word.length()/2; i++){  // an na cause we check half a million
//            stopping the loop when it in the middle

            if(word.charAt(i) != word.charAt(word.length()-1-i)) { // a != a
//  when loop run      add 1                              -1-1     // n != n
//                     add 2                              -1-2 ...if we have more character..etc.
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
