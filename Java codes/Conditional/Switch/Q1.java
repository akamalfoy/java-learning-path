//Java Program to Arithmetic Calculator using switch case Statements

import java.util.Scanner;
public class Q1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char s= sc.next().charAt(0);

        double a = sc.nextInt();
        double b = sc.nextInt();
        switch(s)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(b-a);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println(" Enter a Proper Value") ;
                break;
        }
    }
}