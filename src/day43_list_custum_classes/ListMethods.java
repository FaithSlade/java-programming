package day43_list_custum_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        getDays().get(0);// .get(0); to call the arraylist right away
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());//we directly to read it as arraylist java allow it
        System.out.println("getDays().get(0) = " + getDays().get(0));

        //call by assigned with variable is better
        List<String> dayNames = getDays();
        System.out.println("daysNames = " + dayNames);
        dayNames.add("java day");

        //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(day -> day.length() == 6);//cloud be anything
        // day.length() == 6 kindda if condition give true false
        System.out.println("dayNames after removeIf = " + dayNames);

        List<Integer> newSize = getRandomList(5);
        System.out.println("newSize = " + newSize);
        System.out.println(getRandomList(10));

        System.out.println(faith(5));

        List<Integer> nums = getRandomList(5);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());
        nums.removeIf(n -> n < 90);//remove nums less than 90
        System.out.println("newSize = " + newSize);

        List<Integer> nums2 = getRandomList2(5);
        System.out.println("nums2 = " + nums2);
    }
//---------------------------------------------------------------------------------------
    public static List<String> getDays(){
        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        List<String> days= new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday");
        days.add("Thursday"); days.add("Friday"); days.add("Saturday");
        days.add("Sunday");
        return days;
    }
//----------------------------------------------------------------------------------------
    /**
     * getRandomList
     * param: int size
     * return List<Integer>
     * generate random numbers(0 - 100) the count of size, and assign to list then return
     * getRandomList(3) -. 43, 12, 54
     * getRandomList(2) -. 1, 2
     */

    public static List<Integer> getRandomList(int size) {
//        Random random = new Random(size);
//        int randomNums = random.nextInt(100);

        Random random = new Random();// new Random object with 0 - 100 limit
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            nums.add(random.nextInt(101));//generate random 0-100 limit number and add to list
//            nums.add(randomNums);
        }
        return nums;
    }
 //---------------------------------------------------------------------------------------
    /**
     * to preventing duplicate number
     */

    public static List<Integer> getRandomList2(int size) {
        Random random = new Random(); //new Random object
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            int n = random.nextInt(101);
            if (!nums.contains(n)) {
                nums.add(n);
//          if(!list.contains(random)){
//          list.add(random.nextInt(100));
//          }else{
//           i--;
//            }
            }
        }
        return nums;
    }
// -----------------------------------------------------------------------
        public static List<Integer> faith(int size){
            Random random = new Random();

            List<Integer> newSize = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomNums = random.nextInt(101);
                newSize.add(randomNums);
            }
            return newSize;
        }
    }


