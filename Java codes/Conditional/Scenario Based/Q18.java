//Q18.Write a Java program to calculate water bill using slab rates (≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        double bill = 0;
        if (liters <= 1000) bill = 0;
         else if (liters <= 3000) bill = 5 * ((liters - 1000) / 1000.0);
         else bill = ((5 * 2) + 10 * ((liters - 3000) / 1000.0));
        System.out.println("Water bill: " + bill);
    }
}
