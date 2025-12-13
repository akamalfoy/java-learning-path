//Q13.Write a Java program to display mobile battery status (full, moderate, low).
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery == 100) {
            System.out.println("Battery Full");
        }
        else if (battery <=60 && battery>=25 ) {
            System.out.println("Moderate");
        }
        else if (battery < 20) {
            System.out.println("Low Battery");
        }
        else {
            System.out.println(" Normal");
        }
    }
}
