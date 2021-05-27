package replit.string;

/**
 * Given a String message in the following format:
 * Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
 * assign the value of the sender, phoneNumber, and messageBody variables and print them.
 * Sender: Mike Smith
 * Phone Number: 202-123-3456
 * Message body: I love programing and problem solving
 */
import java.util.*;
public class SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        int startName = message.indexOf("<");
        int endName = message.indexOf(">");
        sender = message.substring(startName+1,endName);
        System.out.println("Sender: " + sender);

        int startPhone = message.indexOf("[");
        int endPhone = message.indexOf("]");
        phoneNumber = message.substring(startPhone+1,endPhone);
        System.out.println("Phone Number: " + phoneNumber);

        int startSMS = message.indexOf("{");
        int endSMS = message.indexOf("}");
        messageBody = message.substring(startSMS+1,endSMS);
        System.out.println("Message body: " + messageBody);

    }
}
