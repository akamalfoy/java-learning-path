/*
A fruit shop has an offer: Buy 3 mangoes and get 1 free. 
Based on the mango price and total mangoes purchased, compute total mangoes received and amount to pay.
Mango Price: 20   Buy: 10
Total Mangoes: 13  Amount: 200
*/

import java.util.Scanner;
class Q13{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int mp = sc.nextInt();
        int b= sc.nextInt();
        int amnt = mp*b;
        int tm = b/3+b;
        System.out.println("Total mangoes: "+ tm+ "  Amount: "+amnt );
    }
}   