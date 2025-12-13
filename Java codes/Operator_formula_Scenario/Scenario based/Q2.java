/*
A student measures experiment time in minutes but needs the time in seconds. 
The program should convert minutes into seconds.

Minutes: 5
Seconds: 300
*/
import java.util.Scanner;
class Q2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= a*60;
        System.out.println(b +" Seconds");

    }
}   