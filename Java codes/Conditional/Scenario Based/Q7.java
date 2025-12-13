//Write a Java program to calculate electricity bill using slab rates (0–100 free, 101–300 = ₹5/unit, >300 = ₹10/unit) 
// and apply surcharge if consumption exceeds 500 units.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = 0;  //here for less than 100 free so no amnt
        }
        else if (units <= 300) {
            bill = (units - 100) * 5;
        }
        else {
            bill = (200 * 5) + (units - 300) * 10;
        }
        if (units > 500) {                  //over 500 extra charge
            double surcharge = bill * 0.10;   
            bill += surcharge;
        }
        System.out.println("Total Electricity Bill: " + bill);
    }
}
