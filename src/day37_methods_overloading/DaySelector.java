package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        getDayName(6);//just check no print
        System.out.println(getDayName(1)); // check first then comeback to print
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));// check first, print inside and back print null cause no value

//        loop from 1 to 8 and call the getDayName with loop variable
        for(int i =1; i<=8;i++){
            System.out.println(i + " = " + getDayName(i));
        }

        //Store getDayName into variable, and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if(someDay == null) { //cannot use .equals() with null, so we use == with null
            System.out.println("someDay is null for invalid day");
        }

        System.out.println(getDayNameV2(2));
    }

    public static String getDayName(int dayNums) {

        switch (dayNums) {
            case 1:
                return "Monday";
//              break; ERROR it will not work it unreachable code, because return already exits the method
//              and both of them cannot work together
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid day - " + dayNums);
                return null; //is no String object, no value , != "" it different even both is empty
//             but different sense of empty
//      if put break; ERROR Compiler need to be 100 sure that anytime you have method with return,
//                     return need to be run
        }
    }

    public static String getDayNameV2 (int day){
        String dayName; // have this because return only one time;
        switch(day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;
        }
        return dayName;
        // if you want to write return just one time, you have to declare variable in the method
    }
}
