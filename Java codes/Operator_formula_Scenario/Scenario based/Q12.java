/*
A product is sold at a loss. Given selling price and loss amount,
the program calculates the cost price using: CP = SP + Loss.
SP: 400    Loss: 50
Cost Price: 450
*/
import java.util.Scanner;
class Q12{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sp = sc.nextInt();
        int l= sc.nextInt();
        int cp = sp+l;
        System.out.println("Cost price: " + cp);
    }
}   