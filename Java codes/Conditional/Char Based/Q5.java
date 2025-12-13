// Java Program to check whether two characters are equal or not
import java.util.Scanner;
public class Q5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ah = sc.next().charAt(0);
        char bh = sc.next().charAt(0);
        if(ah==bh) System.out.println("Equal");
        else System.out.println("Noo");
    }
}

