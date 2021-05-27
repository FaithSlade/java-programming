package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5)); // test which number is bigger : print 10
        System.out.println(Integer.sum(10,5));//10+5: print 15
        System.out.println(Integer.min(10,5));//print 5
        System.out.println(Integer.MIN_VALUE);//smaller integer can be : print -2147483648
        System.out.println(Integer.MAX_VALUE);//larger integer can be : print 2147483647

        System.out.println(Double.max(234.4,23.9));//234.4
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);//4.9E-324

//        To compare always use in if-else: here it can return 3 value -> -1, 0 , 1 >>
        System.out.println(Double.compare(5,1));// front number is larger it will give you 1
        System.out.println(Double.compare(5,5));// both equals it will give you 0
        System.out.println(Double.compare(5,45));// second number is larger it will give you -1

//        if you put "" it will never work cause it Character
        System.out.println(Character.isDigit('8'));//true
        System.out.println(Character.isDigit('V'));//false

        System.out.println(Character.isAlphabetic('Q'));//true
        System.out.println(Character.isLetter('R'));//true >> it just only letter

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println();

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        System.out.println(Boolean.TRUE.equals(5>3));//true
        System.out.println(Boolean.FALSE);//false
    }
}
