package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop with for loop like: while(true) { }
         * if you ever need pure infinite loop just use while(true)
         *  for(;;) == infinite loop
        for(;;){
            System.out.println("Java is fun");
        }
         */
//        We use it when we know something ahead of time| fixed or we know exactly number
//        start from 0 - end to 5
//     initialization;boolean;up date
//              |         |     |
        for(int i = 0; i <= 5; i++){ //first check i: i:0 and i:0, second check i:1 and i:1
            // line above we initialize inside the loop ; condition ; increase
            System.out.println("hello world");
        }
//    for loop: 1-10, print the number
//        we can use initialize many time, i variable it popular to use in loop
        for(int i =1; i <= 10; i++) { // if you said i<11 it will print 1-10 too, either ways
//     cause when you do <=, =  it will including 10 but if you do only < it not included
//     when you put     i >= length() you need to make it     i >= length()-1
            System.out.print(i);
        }
//        if it true will run to step 3)
//                        |
//      check step 1)     2)    4)
//     only at start      |     |
//               |        |     |
        for(int i = 0; i <= 5; i++){
            System.out.print("i = " + i); //check step number 3
        }
    }
}
