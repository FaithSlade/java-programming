package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        /**
         * a b c d e ... z
         * z ... a
         */
        char letter = 'a';
//        System.out.println("letter = " + letter);
//        letter++;
//        System.out.println("letter = " + letter);
        
        while (letter <= 'z')
        {
//     output: a b c d e f g h i j k l m n o p q r s t u v w x y z
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println("done");
        //

        letter = 'z';
        while (letter >= 'a')
        {
            // reverse order
  // output: a b c d e f g h i j k l m n o p q r s t u v w x y z
            System.out.print(letter + " ");
            letter--;
        }
        System.out.println("done");
    }
}
