// takes a number -> square them -> ans(Sum of digit)-----> sum == number [Neon]

import java.util.Scanner;
class Neon{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n*n;
        int sum =0;
        while(m!=0)
        {
            int digit = m%10;
            sum+=digit;
            m/=10;
        }
        if(sum==n) 
        {
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not a Neon Number" );
        }
        sc.close();
    }
}