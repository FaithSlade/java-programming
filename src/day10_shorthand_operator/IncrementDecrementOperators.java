package day10_shorthand_operator;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);  //1
        i++; // add 1 to the value
        System.out.println("i = " + i);  //add 1 = 2
        i++;
        System.out.println("i = " + i);  //add 1 = 3
        ++i;
        System.out.println("i = " + i);  //add 1 = 4

        int lineOfCode = 15;
        System.out.println("lineOfCode = " + lineOfCode);  //15
//        increase lineOfCode by 1, 3 different ways that we learnt today
        lineOfCode = lineOfCode + 1;
        lineOfCode += 1;
        lineOfCode++;
        ++lineOfCode;
//        ++lineOfCode++;  ERROR
        System.out.println("lineOfCode = " + lineOfCode);  //19
//        they all doing the same exact things

//        type 4 different ways of decreasing by1
        lineOfCode = lineOfCode - 1;
        lineOfCode -= 1;
        lineOfCode--;
        --lineOfCode;
        System.out.println("lineOfCode = " + lineOfCode);  //15

        char letter = 'a';
        System.out.println("letter = " + letter);  //a
        letter++;
        System.out.println("letter = " + letter);  //b
        ++letter;
        letter++;
        System.out.println("letter = " + letter);  //d
        letter = 'a';
        System.out.println("letter = " + letter);  //a
        letter--;
        System.out.println("letter = " + letter);  //`
        letter++;letter++;letter++; // you can put it in the same line
    }
}
