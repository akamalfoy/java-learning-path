//Q2.Write a Java Program to check whether a person is eligible to vote (age ≥ 18)
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String res = (age>=18)? "Eligible" : "Not eligible";
        System.out.println(res);
    }
}