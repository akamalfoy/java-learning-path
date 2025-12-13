/*
Three friends eat at a restaurant and get a single bill. 
They want to split the total bill equally. 
The program calculates how much each friend must pay.
Total Bill: 1500
Each Friend Pays: 500
*/

import java.util.Scanner;
class Q3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= a/3;
        System.out.println(b);
    }
}