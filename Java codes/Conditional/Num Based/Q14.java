//Java Program to check whether a number is divisible by both 3 and 5

import java.util.Scanner;
public class Q14{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c%3==0 && c%5==0) System.out.println("Div by 5 and 3");
        else System.out.println("No bruhhh");
    }
}