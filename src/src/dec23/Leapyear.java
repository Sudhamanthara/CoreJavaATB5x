package src.dec23;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 == 0)))
        {
            System.out.println("It is a Leap year");
        }
        else{
            System.out.println("It is not a Leap year");
        }
    }
}
