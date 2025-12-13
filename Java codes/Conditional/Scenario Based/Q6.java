//Write a Java program to check pass/fail based on marks (marks ≥ 35 = pass).
import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        String res = (mark>=35)? "Pass" : "Fail";
        System.out.println(res);
    }
}
