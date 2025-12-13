// Java Program to check whether a character is alphabet or not
import java.util.Scanner;
public class Q3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ah = sc.next().charAt(0);
        char s = Character.toLowerCase(ah);
        if(s>='a' && s<='z') System.out.println("Alphabt");
        else System.out.println("Nooo");
    }
}