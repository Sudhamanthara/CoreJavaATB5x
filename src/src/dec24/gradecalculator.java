package src.dec24;

import javax.swing.*;
import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark = sc.nextInt();
        if (mark >= 80) {
            System.out.println("Grade A");
        }else if(mark < 80 && mark >= 60){
            System.out.println("Grade B");
        }else if (mark < 60 && mark >=40){
            System.out.println("Grade C");
        }
            else{
            System.out.println("Grade D");
        }
            }
        }


