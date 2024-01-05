package src.loopbasics;

import java.util.Scanner;

public class switc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile name : ");
        String mobile = sc.nextLine();
        switch (mobile) {
            case "Samsung":
                System.out.println("Buy a Samsung mobile");
                break;
            case "Iphone":
                System.out.println("Buy a Iphone mobile");
                break;
            case "Motorolo":
                System.out.println("Buy a Motorolo mobile");
                break;
            case "Oppo":
                System.out.println("Buy a Oppo mobile");
                break;
        }
    }
}
