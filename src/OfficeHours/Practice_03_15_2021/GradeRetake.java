package OfficeHours.Practice_03_15_2021;
/*
    Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
     */
public class GradeRetake {
    public static void main(String[] args) {
//        Total score 100
        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;
//  (int)(baseGrade * 0.10); -> casting so you can cast int or double it fine
//        if(numberOfAttempts == 1) {
//           retakePenalty = (int)(baseGrade * 0.10);
//        }
//        if(numberOfAttempts == 2) {
//            retakePenalty = (int)(baseGrade * 0.20);
//        }
//        if(numberOfAttempts == 3) {
//            retakePenalty = (int)(baseGrade * 0.35);
//        }
// if we do it only if: java will check every line even it not match.
//        else if multi branch: java check only the true
        if(numberOfAttempts == 1) {
            retakePenalty = (int)(baseGrade * 0.10);
        } else if(numberOfAttempts == 2) {
            retakePenalty = (int)(baseGrade * 0.20);
        } else if(numberOfAttempts == 3) {
            retakePenalty = (int)(baseGrade * 0.35);
        } else{
            System.out.println("Invalid attempt number");
        }

        System.out.println("Grade after retake attempt " + numberOfAttempts + " was: " + (baseGrade - retakePenalty));

        }
    }

