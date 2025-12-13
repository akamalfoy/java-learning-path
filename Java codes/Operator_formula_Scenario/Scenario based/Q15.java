/*
An ATM dispenses money in ₹2000, ₹500, and ₹100 notes. 
For a given amount, calculate the number of each note required (highest denomination first).
Amount: 3700
2000 Notes: 1500 Notes: 3100 Notes: 2
*/
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int n2k = amt / 2000;
        amt = amt % 2000;
        int n5h = amt / 500;
        amt = amt % 500;
        int n1h = amt / 100;
        System.out.println("2000 Notes: " + n2k);
        System.out.println("500 Notes: " + n5h);
        System.out.println("100 Notes: " + n1h);
    }
}
