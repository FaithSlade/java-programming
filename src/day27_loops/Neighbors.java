package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
//                     012345
        String word = "jaavva";
//   reading TWO at the time word.length()-1, Reading THREE at the time -2 ..etc.
//                                              |
        for (int index = 0; index < word.length() - 1; index++) {
            System.out.print(word.charAt(index)); //mean 0 = j
            System.out.println(word.charAt(index + 1)); //1+1 =2 print a
//            print pair
//  first read it represent: j      ==           a
            if (word.charAt(index) == word.charAt(index + 1)) {  //first read true go beep/ false go up to condition
                System.out.println("beep - " + word.charAt(index));
            }
        }
    }
}