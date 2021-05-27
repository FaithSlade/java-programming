package OfficeHours.Practice_04_07_2021;

/**
 * Camel CaseGiven a String of words that follow Camel Case convention.
 * Find and print how many words are in the given String.Every word,
 * except the first word, begin with an uppercase letter.
 * The other characters of the word will be lowercase
 * Ex:
 * Input:thisHasManyWordsToFind
 * Output: 6
 */
public class CameCase {
    public static void main(String[] args) {

        String str = "thisHasManyWordsToFind"; //total 6 word so we count 5 word only upper case
        int words = 1; // started from 1 cause first word is lower case

        for(int i=0; i < str.length(); i++) {

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                words++;
            }

        }

        System.out.println("Words: " + words);
    }

}
