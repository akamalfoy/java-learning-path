/*
A computer networks student wants to convert bytes into bits. 
Since 1 byte = 8 bits, the program multiplies accordingly.
Bytes: 4
Bits: 32
*/
import java.util.Scanner;
class Q6{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= a*8;
        System.out.println(b +" Bits");

    }
}   