//Write a Java Program to calculate different discount for different Bill amount
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;
        if (bill < 1000) {
            discount = 0.15 * bill;   // 15%
        } 
        else if (bill < 5000) {
            discount = 0.25 * bill;   // 25%
        } 
        else if (bill < 10000) {
            discount = 0.30 * bill;   // 30%
        } 
        else {
            discount = 0.35 * bill;   // 35%
        }
        double finalAmount = bill - discount;
        System.out.println("Bill Amount: " + bill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
