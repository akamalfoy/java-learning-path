//Java Program to check grade of a student based on marks (A, B, Java, Fail)
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }
        int n = marks / 10;
        switch(n) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
            case 6:
                System.out.println("Grade: Pass");
                break;
            default:
                System.out.println("Grade: Fail");
        }
    }
}
