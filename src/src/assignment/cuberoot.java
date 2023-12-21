package src.assignment;

import java.util.Scanner;

public class cuberoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x1 = sc.nextFloat();
        System.out.println("Enter the value of y");
        double y1 = sc.nextFloat();
        System.out.println("Enter the value of z");
        double z1 = sc.nextFloat();
        double x = x1 * x1;
        System.out.println("Square value of x is: " + x);
        double y = y1 * y1;
        System.out.println("Square value of y is: " + y);
        double z = Math.abs(z1);
        double value = Math.cbrt(x+y-z);
        System.out.println("Total value is: " + value);
    }
}
