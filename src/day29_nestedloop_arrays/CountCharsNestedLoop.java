package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
//                     0123
        String word = "java";

        for (int out = 0; out < word.length(); out++) {
//            System.out.println("outer: " + word.charAt(out));
            int count = 0;  //everytime run it reset count to 0zero
            for (int in = 0; in < word.length(); in++) {
//                System.out.println(word.charAt(in));
                if(word.charAt(out) == word.charAt(in)) {
                    count++;
                }
            }
            System.out.println(word.charAt(out) + "=" + count);
        }

    }
}
