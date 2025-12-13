//Q16.Write a Java program to validate a mobile number . If it has 10 or more digits, print “Valid Number”, otherwise print “Invalid Number”.
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        long number = sc.nextLong();
        if (number % 10000000000L == number) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
