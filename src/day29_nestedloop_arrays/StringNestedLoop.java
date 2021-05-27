package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {  //if you put <= 1234 and charAt 01234 so 4 is outofbound
            for (int j = 0; j <= i; j++) {
            System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        System.out.println();
//     useful when you looking for duplicate
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();

        }
    }
}
