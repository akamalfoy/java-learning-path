/*
A bakery produces a fixed number of cakes every hour. Given cakes per hour and total hours, the program calculates total cakes made.
Cakes/Hour: 10Hours: 5
Total Cakes: 50
*/
import java.util.Scanner;
class Q8{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        int b= a*t;
        System.out.println(b);
    }
}