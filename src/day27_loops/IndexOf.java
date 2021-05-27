package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github"; // if we have 2 g: "ggithub" it found only the first one
        char letter = 'h';  // 'v' not found it, it will jump to if-else outside the loop
        int index = -1; // if you use 0 it mean valid number but in this case we try to do something invalid number
//        that while we use -1
        // if letter=charAt(n), store the n value into index

        for( int n = 0; n < word.length(); n++){  //first check n=0
            System.out.println(n + " - " + word.charAt(n));
            if(word.charAt(n) == letter){ // n need to be variable not 'n' ERROR
                index = n; //to store 0 in n variable and it can use outside the loop
                System.out.println(letter+" is found at index number "+index);
                break; // when they found t it will exit the loop but still in java program
//     or       return; it different from break: return;more powerful it stop java program
            }
        }
//        if use else it will keep running and running none stop
             if(index == -1){
                System.out.println(letter + " is not present");
            } else {
                 System.out.println(letter +" is found at index " + index);
             }
    }
}
