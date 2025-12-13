//Write a Java program to check if temperature is above 100 (fever check).
import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float temp = sc.nextFloat();
    if (temp > 100) System.out.println("Fever");
    else  System.out.println("No Fever");
    }
}
