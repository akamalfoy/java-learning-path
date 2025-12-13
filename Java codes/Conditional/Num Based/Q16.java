// Java Program to check whether a number is divisible by both 2 and 5 but not by 8.

import java.util.Scanner;
public class Q16{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if((c%2==0 && c%5==0) && (c%8!=0)) System.out.println("yepp");
        else System.out.println("No bruhhh");
    }
}