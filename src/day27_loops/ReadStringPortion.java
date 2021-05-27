package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
//                     01234567.....
        String list = "cat,car,cat,red_car,java,selenium";
        System.out.println(list.length());
// using substring print first 3 letters
        int i = 0;
        System.out.println(list.substring(i, i + 3));
        i++;  //1
        System.out.println(list.substring(i, i + 3));
        i++;  //2
        System.out.println(list.substring(i, i + 3));
        i++;  //3
//        or
        System.out.println(list.substring(0, 3));
        System.out.println(list.substring(1, 4));
        System.out.println(list.substring(2, 5));
//
//                  print first 3 letters (j++, j++ + 3) ->  1,1+3
//                                  |          |                ^
        for (int j = 0; j < list.length() - 2; j++) {//         |
            System.out.println(list.substring(j, j + 3));//     |
//                                            0  ,0+3  -> cat -
//print 3 at the time: list.length()-2 = -2 we want to stop 2 character before/earlier
//            if don't put -2 it will ERROR cause number over the list.length()
//            number 1+3 can't over total list.length() = 33
            if (list.substring(j, j + 3).equals("cat") || list.substring(j, j + 3).equals("car")) {
                System.out.println("cat or car found");
//                or do with variable
//                for (int i = 0; i < list.length() - 2; i++) {
//                    String part = list.substring(i, i + 3);
//                    System.out.println("part = " + part);
//                    if (part.equals("cat") || part.equals("car")) {
//                        System.out.println("cat or car found");
//                    }
                }
            }
        }
    }

