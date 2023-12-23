package src.dec23;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int i=1;
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        while(i<=number){
         fact=fact*i;
         i++;
        }
        System.out.println("Factorial value is " +fact);
    }
}
