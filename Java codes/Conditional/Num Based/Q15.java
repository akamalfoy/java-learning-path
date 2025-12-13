// Java Program to check whether a number is divisible by either 3 or 7

import java.util.Scanner;
public class Q15{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c%3==0 || c%7==0) System.out.println("yepp");
        else System.out.println("No bruhhh");
    }
}