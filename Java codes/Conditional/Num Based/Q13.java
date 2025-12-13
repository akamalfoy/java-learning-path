//Java Program to check whether a number is positive, negative, or zero
import java.util.Scanner;
public class Q13{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = (a>0)? "Positive" : (a<0)? "Negative" : "Zero";
        System.out.println(b);
    }
}