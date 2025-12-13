// Java Program to check whether the product of two numbers is positive or negative
import java.util.Scanner;
public class Q19{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        String bd= (c>0)? "Positive" : (c<0)? "Negative" : "Zero";
        System.out.println(bd);

    }
}