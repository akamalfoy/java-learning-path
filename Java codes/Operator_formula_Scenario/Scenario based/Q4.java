/*
A person drives at a constant speed. 
Given the speed (km/hr) and time (hr), the program must calculate the distance travelled using:
distance = speed × time.
Speed: 60 Time: 2
Distance: 120 km
*/
import java.util.Scanner;
class Q4{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        int b= a*t;
        System.out.println(b);
    }
}