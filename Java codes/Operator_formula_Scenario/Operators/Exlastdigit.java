import java.util.Scanner;
public class Exlastdigit{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = a%10;
        int n = a/10;
        System.out.println(n);
    }
}
