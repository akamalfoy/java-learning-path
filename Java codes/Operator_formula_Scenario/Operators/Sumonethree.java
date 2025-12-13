//Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number.//
import java.util.Scanner;
public class Sumonethree{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        while(a!=0)
        {
          int n = a%10;
          sum+=n;
          a= a/100;
        }
        System.out.println(sum);
    }
}
