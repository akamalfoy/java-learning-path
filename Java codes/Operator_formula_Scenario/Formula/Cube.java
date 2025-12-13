//Write a Java Program to find Surface Area, Volume, and Perimeter of a Javaube

import java.util.Scanner;
class Cube {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float vol = a*a*a;
        float area = 6*(a*a);
        float per = 12*a;
        System.out.println("Area "+area+ "\n Volume "+vol +"\n Per "+per);
    }
}
