import java.util.Scanner;
class Celtofar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double c = (a*9/5)+32;
        System.out.printf("%.2f",c);
    }
}
