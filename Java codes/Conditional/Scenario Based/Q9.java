//Q9.Write a Java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).

import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = 5000; 
        double amnt = sc.nextDouble();
        if (amnt > bal) {
            System.out.println("Insufficient balance!");
        } else if (amnt % 100 != 0) {
            System.out.println("Amount must be a multiple of 100!");
        } else {
            bal -= amnt;
            System.out.println("Withdrawal successful. Remaining balance: " + bal);
        }
    }
}
