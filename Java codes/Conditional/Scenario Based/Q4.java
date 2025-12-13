//Write a Java program to display mobile Battery check – "Low Battery", "50% consumed", or "Battery Full".

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery == 100) {
            System.out.println("Battery Full");
        }
        else if (battery <=50) {
            System.out.println("50% consumed");
        }
        else if (battery < 20) {
            System.out.println("Low Battery");
        }
        else {
            System.out.println("Battery Status Normal");
        }
    }
}
