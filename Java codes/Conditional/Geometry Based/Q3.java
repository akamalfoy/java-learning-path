// Java Program to check whether a point (x, y) lies in which quadrant
import java.util.Scanner;
public class Q3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String res =(x>0 && y>0 ) ?  "First":(x>0 && y<0) ? "Four" : 
        (x<0 && y>0) ? "Second" :(x<0 && y<0) ? "Third" : "Orgin";
        System.out.println(res);
    }
}