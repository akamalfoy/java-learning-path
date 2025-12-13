//Write a Java Program to check whether a given year and month combination is valid 
//  print the number of days in that month (consider leap years for February).
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }
        if(month ==1||month ==3|| month ==5|| month ==7|| month ==9|| month ==10||month ==12) System.err.println("Days:31");
        else if (month ==4||month ==8|| month ==9|| month ==11) System.out.println("Days:30");
        else {
            if((year%4==0 && year %100!=0)|| year % 400==0) System.out.println("Days:29");
        else System.out.println("Days:28");
        }
    }
}