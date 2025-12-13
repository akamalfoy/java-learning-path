//Q11.Write a Java program to apply discount based on purchase amount.

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;
        if (bill < 1000) {
            discount = 0.15 * bill;   
        } 
        else if (bill < 5000) {
            discount = 0.25 * bill;   
        } 
        else if (bill < 10000) {
            discount = 0.30 * bill;   
        } 
        else {
            discount = 0.35 * bill;   
        }
        double finalAmount = bill - discount;
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}