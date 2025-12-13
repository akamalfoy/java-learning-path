// Java Program to check whether a triangle is right-angled or not
import java.util.Scanner;
public class Q2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x,y;
        int res =(a>=b && a>=c ) ? a :(b>=c) ? b : c;
        if (res==a) {x=b; y=c;} 
        else if(res==b) {x=a; y=c;}
        else {x=a; y=b;}

        if (res*res ==x*x+y*y) System.out.println("Yesss");
        else System.out.println("Nopeee");
    }
}