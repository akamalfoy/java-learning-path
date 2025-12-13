import java.util.Scanner;
class Fartocel {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double c = (a-32)*5/9;
        System.out.printf("%2f",c);
    }
}

