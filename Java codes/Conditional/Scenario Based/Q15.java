//Q15.Write a Java program to check whether vehicle speed exceeds 100 km/h.
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("speed ");
        int speed = sc.nextInt();
        if (speed > 100) {
            System.out.println(" Slow down");
        } else {
            System.out.println("Thats my boy");
        }
    }
}
