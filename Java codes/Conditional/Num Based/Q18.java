//Java Program to check whether a number is a single-digit, two-digit, or three-digit number

import java.util.Scanner;
public class Q18{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String s = String.valueOf(b); // valueof instead of [Integer.toString]
        int len = s.length();
        String result = (len==1)? "Single" : (len==2)? "Double" : (len==3)? " Three-digit" : "Dont mess with me";
        System.out.println(result);

    }
}
