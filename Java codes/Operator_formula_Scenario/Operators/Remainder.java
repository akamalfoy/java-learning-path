import java.util.Scanner;
public class Remainder{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        int c = (int)(a%b);
        System.out.println(c);
    }
}

