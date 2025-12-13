import java.util.Scanner;
public class Middigit{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        String s = Integer.toString(a);
        int len = s.length();
        if(len%2==1)
        {
          System.out.println(s.charAt(len/2));
        }
        else
        {
            System.out.println(" " + s.charAt(len/2-1)  + s.charAt(len/2));
        }
        sc.close();
}
    }

