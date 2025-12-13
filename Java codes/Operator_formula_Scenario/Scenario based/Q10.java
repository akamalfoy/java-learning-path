/*
A company calculates employee salary using: Basic + HRA + Allowance. The program must compute the total salary.
Basic: 20000  HRA: 5000  Allowance: 3000
Total Salary: 28000
*/
import java.util.Scanner;
class Q10{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int si = p+r+t;
        System.out.println("Total Salary: " + si);
    }
}   