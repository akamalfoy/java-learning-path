//Java Program to check whether a character is a digit or not

import java.util.Scanner;
public class Q4{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ah = sc.next().charAt(0);
        char s = Character.toLowerCase(ah);
        if (s>='0' && s<='9') System.out.println("Numerical");
        else System.out.println("Noo");
    }
}
