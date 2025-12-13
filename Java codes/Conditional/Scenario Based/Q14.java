//Q14.Write a Java program to assign ticket price based on passenger age (child, adult, senior).
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();
        int price;
        if (age < 12) {
            price = 50;  
            System.out.println("Child "+price);
        } else if (age >= 12 && age < 60) {
            price = 100; 
            System.out.println("Adult " + price);
        } else {
            price = 70; 
            System.out.println("Senior " + price);
        }
    }
}
