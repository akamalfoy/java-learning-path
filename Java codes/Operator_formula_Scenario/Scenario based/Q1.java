/*
A shop offers festival discounts. 
The customer enters the original price and discount percentage. 
The program must calculate the discount amount and the final price payable after applying the discount.

sample ip: Original Price: 1000 Discount: 10
Discount Amount: 100.0 Final Price: 900.0

*/
import java.util.Scanner;
class Q1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b= sc.nextFloat();
        float dis = a*b/100;
        float famnt = a-dis;
        System.out.println("Dicount: "+dis+"\nFinal Amount: "+famnt);
    }
}