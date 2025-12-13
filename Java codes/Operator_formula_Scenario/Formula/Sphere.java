import java.util.Scanner;
class Sphere {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float r = a*a;
        float r2 = r*a;
        double vol = ((4/3)*3.14*r);
        double area = ((4*3.14)*r);
        System.out.println("Area "+area+ "\n Volume "+vol );
    }
}
