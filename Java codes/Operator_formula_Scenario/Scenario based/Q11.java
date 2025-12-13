/*
A shopkeeper sells an item at a profit.
 Given cost price and profit, calculate the selling price using: SP = CP + Profit.
CP: 500  Profit: 100
Selling Price: 600
*/
import java.util.Scanner;
class Q11{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int p = sc.nextInt();
        int sp = p+cp;
        System.out.println("Selling prize: " + sp);
    }
}   