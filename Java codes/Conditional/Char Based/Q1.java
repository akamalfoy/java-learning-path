//Java Program to check whether a given character is a vowel or consonant
import java.util.Scanner;
public class Q1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char s = Character.toLowerCase(a);
        if(s=='a'|| s=='e'||s=='o'|| s=='i'||s=='u') System.out.println("Vowel");
        else  System.out.println("Nahhhh bruhh");
    }
}
