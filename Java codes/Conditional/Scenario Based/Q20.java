//Q20.Write a Java program to Javaheck if vehicle speed exceeds 100 km/h.("Over-speeding! Fine imposed.","Speed iswithin limit")
import java.util.Scanner;
public class Q20 {
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
