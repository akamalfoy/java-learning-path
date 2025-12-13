//Java Program using switch to implement a mini ATM simulation

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 20000;  // initial balance
        int amount;

        System.out.println(" Mini ATM ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch) {
            case 1: 
                System.out.println( balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextInt();
                balance += amount;
                System.out.println( + balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextInt();
                if(amount > balance) {
                    System.out.println("Insufficient");
                } else {
                    balance -= amount;
                    System.out.println("Remaining" + balance);
                }
                break;
            case 4:
                System.out.println("Bye Bye!");
                break;
            default:
                System.out.println("Invalid Option!");
        }
    }
}
