import java.util.Scanner;
public class Q4{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int firstTwo = a / 100;
        int lastTwo = a % 100;

        if(firstTwo == lastTwo)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}

