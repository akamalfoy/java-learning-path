// Java Program to check whether the last digit of a number is odd or even

import java.util.Scanner;
public class Q12{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = a%10;
        if(c%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}