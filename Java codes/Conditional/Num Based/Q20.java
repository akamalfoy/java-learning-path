//Java Program to check whether the ASCII value of a character is even or odd.
import java.util.Scanner;
public class Q20{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int) a;
        String r = (b%2==0) ? "Even" :  "Odd";
        System.out.println(r);
        
     }
}