package replit.loops;

/**
 * Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
 * Ask for the first guest name.
 * Then ask does user want to enter one more guests.
 * If yes - take the next guest input
 * If not - finish the program and print list of the guests.
 * Example:
 * Please enter guest name:
 * Nick
 * Do you want to enter new guest name:
 * yes
 * Please enter guest name:
 * Linda
 * Do you want to enter new guest name:
 * no
 * Guest's list: Nick, Linda
 */
import java.util.*;
public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guestName;
        String newGuest;
        String totalGuest = "";
        int guestNumber = 1;
        for (int i = 1; i <= guestNumber; i++) {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            System.out.println("Do you want to enter new guest name:");
            newGuest = input.next();
            if (newGuest.equalsIgnoreCase("yes")) {
                totalGuest += guestName + ", ";
                guestNumber++;
            } else {
                totalGuest += guestName;
                System.out.println("Guest's list: " + totalGuest);
            }
        }
    }
}
