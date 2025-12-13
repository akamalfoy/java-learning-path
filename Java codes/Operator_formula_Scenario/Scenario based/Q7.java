/*
A teacher distributes candies equally among students. The program finds how many candies each student gets and how many remain undistributed.
Candies: 50   Students: 6
Each Gets: 8
Remaining: 2
*/
import java.util.Scanner;
class Q7{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        int eachg = a/c;
        int remain = a%c;
        System.out.println(eachg+" Chocolate" +"\n"+ remain +" Remaining");
    }
}   