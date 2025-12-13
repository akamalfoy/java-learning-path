// Write a Java Program using switch case to print the season based on month number(Winter, Spring, Summer, Autumn).
import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        switch(day)
        {
            case 12:
            case 2:
            case 1:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Rainy");
            case 9:
            case 10:
            case 11:
                System.out.println("Spring");
                break;
            
            default:
                System.out.println("Enter proper value btw 1-12");
                break;
        }
    }
}