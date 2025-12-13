//Q17.Write a Java program to assign different ticket prices based on day of the week (weekday/weekend).
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        String day = sc.nextLine().toLowerCase();
        int price;
        switch(day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                price = 100; // weekday price
                System.out.println( price);
                break;
            case "saturday":
            case "sunday":
                price = 150; // weekend price
                System.out.println( price);
                break;
            default:
                System.out.println("Invalid day entered!");
        }
    }
}
