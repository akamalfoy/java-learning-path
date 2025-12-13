//Java Program to find whether the given number is 3 digit number or not

import java.util.Scanner;
public class Q5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=Math.abs(a);
        if(a >= 100 && a <= 999)
            System.out.println("3 Digit");
        else
            System.out.println("Noo");
    }
}