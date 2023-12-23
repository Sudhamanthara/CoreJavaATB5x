package src.dec23;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year = 2000;
        if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println("True !! It is a Leap year");
        }
        else{
            System.out.println("False .. It is not a Leap year");
        }
    }
}
