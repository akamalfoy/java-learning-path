//Write a Java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in °C: ");
        int temp = sc.nextInt();
        if (temp < 10) {
            System.out.println("Cold");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Pleasant");
        } else if (temp >= 20 && temp < 35) {
            System.out.println("Hot");
        } else {
            System.out.println("Heatwave");
        }
    }
}
