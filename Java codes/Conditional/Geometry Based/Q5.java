//Java Program to check whether three sides form a valid triangle

import java.util.Scanner;
public class Q5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b) System.out.println("Yes");
        else System.out.println(" Nooooo");

    }
}