import java.util.Scanner;
class Cylinder {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        float a = r*r;
        double vol = (3.14*a*h);
        double area = 2*3.14*a*(r+h);
        System.out.println("Area "+area+ "\n Volume "+vol );
    }
}
