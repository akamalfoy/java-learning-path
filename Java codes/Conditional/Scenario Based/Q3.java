//Write a Java Program to check whether a person is eligible for senior citizen benefits (age ≥ 60)
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String res = (age>=60)? "Eligible" : "Not eligible";
        System.out.println(res);
    }
}