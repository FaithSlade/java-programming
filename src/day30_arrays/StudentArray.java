package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5];
// useful when you don't know value and you want to put value inside the loop
//        we can use this in scanner cause we don't know the value
        student1[0] = "1234";
        student1[1] = "Faith";
        student1[2] = "Slade";
        student1[3] = "B22";
        student1[4] = "925-548-5985";
//        or
//        index               [0]  ,  [1]  ,  [2]  , [3] ,      [4]
        String[] student2 = {"2345","Derek","Slade","B22","925-548-5984"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        //check if student1 data array contains 5 items.
        //        true: PASS: data array has correct length
        //        false: FAIL: data array has incorrect length
        if(student1.length == 5){
            System.out.println("Pass: data array has correct length");
        }else{
            System.out.println("Fail: data array has incorrect length");
        }
        /**
         * check if student1 and student2 arrays have same number of data
         *          TRUE: PASS: data arrays length match
         *          FALSE: FAIL: data arrays length mismatch
         */
        if(student1.length == student2.length){
            System.out.println("Pass: data array length match");
        }else{
            System.out.println("Fail: data array length mismatch");
        }

        /**
         * print firstname and lastname in all uppercase
         * covert it Ex: FAITH SLADE
         */
        System.out.println(student1[1].toUpperCase() + " " +student1[2].toUpperCase());
// or (student1[1] + " " + student1[2]).toUpperCase() -> use () to concat first then convert it

        String mobileNum =student1[4]; //student1[4] = "925-548-5985";
        // we use it as string not number so don't use int ERROR because it string
        System.out.println(mobileNum.length()); //we use () here cause mobileNum use data type normal string
        System.out.println(mobileNum.startsWith("202"));
    }
}
