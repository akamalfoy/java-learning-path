import java.util.Scanner;
class Cuboid {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float vol = a*b*c;
        float area = (2*((a*b)+(b*c)+(a*c)));
        float per =12*a;
        System.out.println("Area "+area+ "\n Volume "+vol +"\n Per "+per);
    }
}