package src.dec24;

import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        int digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int number = sc.nextInt();
        while (number>0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("The sum of the digit is " +sum );
        }
        }

