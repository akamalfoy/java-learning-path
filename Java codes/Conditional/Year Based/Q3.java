//Java Program to check whether the first two digits and last two digits of a year are equal.
import java.util.Scanner;
public class Q3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%100;
        int c = a/100;
        if (b==c) System.out.println("Equal");
        else System.out.println("Not equal");
    }
}