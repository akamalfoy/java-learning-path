//Java Program to check whether the given day number (1–7) is a weekday or weekend
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        switch(day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 7:
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter proper value btw1-7");
                break;
        }
    }
}
