package day24_loops;

public class WhileLoopReverse<unreadSMS1> {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;

        while (count >= 0) { //for last running check: it will check -1 then exit to false
            System.out.println("Reverse = " + count);
            count--; //if it ++ it become infinite until finish range of data type
            Thread.sleep(0);
        }
        System.out.println("Finish count"); // called Decrement outside of {}

        /**
         * Read each message 1 by 1 until you have 0 unread sms
         * while unreadSMS is more than 0. read one by one
         */
        int unreadSMS = 10;
        while (unreadSMS >= 0){
            System.out.println("You have " + unreadSMS + " unread messages");
            unreadSMS--;
        }
        System.out.println("No more message \uD83D\uDCE9");

        //    when you want to: not print "You have 0 unread messages"
        int unreadSMS1 = 10;
        while (unreadSMS1 > 0){ // make it with out = signed: last run is 1 then 0 and Exit
            System.out.println("You have " + unreadSMS1 + " unread messages");// last run is 1
            --unreadSMS1; // last run is 1
        }
        System.out.println("No more message \uD83D\uDCE9");
    }
}





