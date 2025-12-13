//Java Program to check whether a given character is uppercase, lowercase, digit, or special symbol

import java.util.Scanner;
public class Q2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ah = sc.next().charAt(0);
        char s = Character.toLowerCase(ah);
        if(s>='a' && s<='z') System.out.println("Alphabt");
        else if (s>='0' && s<='9') System.out.println("Numerical");
        else System.out.println("Special Character");
    }
}
