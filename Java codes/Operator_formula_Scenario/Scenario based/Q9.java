/*
A person deposits money in the bank.
Using the formula SI = (P × R × T) / 100, the program computes simple interest.
P:5000 R:5  T:2
Simple Interest: 500.0
*/
import java.util.Scanner;
class Q9{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int si = (p*r*t)/100;
        System.out.println("Simple-Intrest: " + si);
    }
}   