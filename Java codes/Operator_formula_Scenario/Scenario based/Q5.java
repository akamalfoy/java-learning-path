/*
A fitness trainer tracks running distances in meters.
 Athletes give distance in kilometers, so the program converts km → meters.
 KM: 3
 Meters: 3000
*/
import java.util.Scanner;
class Q5{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= a*1000;
        System.out.println(b+" Meters");

    }
}   