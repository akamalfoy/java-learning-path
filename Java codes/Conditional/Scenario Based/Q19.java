//Q19.Write a Java program to display mobile data usage alert – "Low Data", "Half consumed", or "Data Over" based on usage.

import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total data ");
        double tdata = sc.nextDouble();
        System.out.print("Data used (MB) ");
        double udata= sc.nextDouble();
        double rdata = tdata - udata;
        if (rdata <= 0) {
            System.out.println("Data Over");
        } else if (rdata <= tdata / 2) {
            System.out.println("Half consumed");
        } else {
            System.out.println("Low Data"); 
        };
    }
}
