package day16_swith_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor - 6" + floorNum);
        }

        System.out.println("==========SWITCH STATEMENT VERSION==========");

        floorNum = 1;
        switch (floorNum) {
            case 1:  //if (floorNum == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;  //Exit switch statement
            case 2: // } else if (floorNum == 2) {
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:  // } else if (floorNum == 3) {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:  //same as else statement
                System.out.println("Invalid floor - 6" + floorNum);
                break;  //for default using break is optional sometime we don"t need it
        }
    }
}
