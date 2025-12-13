// QJava Program to find whether the last digit of given number is divisible by 3

import java.util.Scanner;
public class Q8{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%10;
        if(b%3==0) System.out.println("It does bruhh");
        else  System.out.println("Nahhhh bruhh");
    }
}