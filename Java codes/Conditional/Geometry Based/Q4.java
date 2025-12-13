// Java Program to check whether the sum of three angles forms a valid triangle.
import java.util.Scanner;
public class Q4{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b) System.out.println("Valid traingle");
        else System.out.println(" Not a Valid traingle");

    }
}