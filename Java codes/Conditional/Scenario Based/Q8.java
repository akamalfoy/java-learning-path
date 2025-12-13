//Q8.Write a Java program to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spin = 1234;  
        int epin = sc.nextInt();
        if (epin == spin) {
            System.out.println("PIN verified");
        } else {
            System.out.println("Incorrect PIN.");
        }
    }
}
