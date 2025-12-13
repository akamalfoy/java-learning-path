/*
A stationery shop offers: Buy 5 pens, pay only for 3. 
Given price per pen and pens bought, the program calculates how many pens need to be paid for and total cost.
Pen Price: 10   Buy: 12
Pay For: 8   Total Amount: 80
*/
import java.util.Scanner;
class Q14{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int pp = sc.nextInt();
        int b= sc.nextInt();
        int di = b/5;
        int mod = b%5;
        int fpen = di*3+mod;
        int amnt =pp*fpen;
        System.out.println("pay for: "+ fpen+ "  Amount: "+amnt );
    }
}   