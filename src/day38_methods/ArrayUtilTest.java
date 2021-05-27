package day38_methods;

public class ArrayUtilTest {
    public static void main(String[] args) {
// it can be new name of variable or same variable with int[] nums in printArray method
//              |
        int[] nums1 = {5, 23, 1, 543, 90};// created value
//        need to declare new array first to pass in the method
        ArrayUtils.printArray(nums1); //5 23 1 543 90
//        or
        ArrayUtils.printArray(new int[] {23,64,23,534,234,45,234,45}); // if you want to print one line: 23 64 23 534 234 45 234 45

        System.out.println("sum = " + ArrayUtils.sum(nums1));//sum = 633
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23,64,23,534,234,45,234,45}));//sum = 279

        ArrayUtils.sum(nums1);
        System.out.println("sum = " + ArrayUtils.sum(nums1));//sum = 633


        int[] num2 = {4,1,5,8};

        System.out.println("5 - found = " + ArrayUtils.contains(num2, 5));//false
        System.out.println("10 - found = "+ ArrayUtils.contains(num2,10));//false

//        int[] num2 = {4,1,5,8};
//        int num = 5;
//        boolean found = false;
//
//        for(int each : num2) {
//            if (each == num) {
//                found = true;
//                break;
//            }
//        }
//        System.out.println("found = " + found);
        }
    }

