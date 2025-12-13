// Java Program to calculate the distance between two points (x1,y1) and (x2,y2).
import java.util.Scanner;
public class Q7{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1= sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int dx = x2-x1;
        int dy = y2-y1;
        double dist = Math.sqrt(dx*dx+dy*dy);
        System.out.println(dist);
    }
}