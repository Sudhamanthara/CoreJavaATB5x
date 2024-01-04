package src.dec24;

import java.util.Scanner;

public class basicarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the first subject");
        marks[0] = sc.nextInt();
        System.out.println("Enter the second subject");
        marks[1] = sc.nextInt();
        System.out.println("Enter the third subject");
        marks[2] = sc.nextInt();
        System.out.println("Enter the fourth subject");
        marks[3] = sc.nextInt();
        System.out.println("Enter the fivth subject");
        marks[4] = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]<30){
                System.out.println("OOPS You are Fail");
            }
            System.out.println(marks[i]);
        }
    }
}
