package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main (String[] args){
        String message = "Sender: [Nadir] From Number<222-333-4444> Message:{Hello,lets code some java}";
        int start = message.indexOf("[")+1;  //[Nadir to deleted [ have to +1
        int end = message.indexOf("]");
        System.out.println(message.substring(start,end));
        String sender = message.substring(start,end);
        System.out.println("sender = " + sender);//sender = Nadir

//        checked what number by debug -> evaluate expression
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);//mobile = 222-333-4444

//        substring don't include the last character that why we we don't make  -1 at the end
        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text = " + text); //text = Hello,lets code some java

//        String num = message.substring(35,30); ERROR
//        bigger number cannot come first so it ERROR

//        .trim() it remove empty space both side left and right
//        but not the middle one
//        it remove \t, \n too
        System.out.println(" Faith ".trim());
        System.out.println("text = " + text);

//        String message = "Sender: [ Nadir ] From Number<222-333-4444> Message:{Hello,lets code some java}";

        sender = sender.trim();
        System.out.println();

        if(sender.equals("Nadir")) {
            System.out.println("Message from Nadir about soft skill"); //print no spaces
        } else {
            System.out.println("some one else message");


        }
    }
}
