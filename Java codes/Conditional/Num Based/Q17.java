// Java Program to check whether two numbers have the same last digit

import java.util.Scanner;
public class Q17{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a%10;
        int d = b%10;
        String result = (c==d)? "Yes" : "No";
        System.out.println(result);

    }
}
