//.Write a Java program to print "Stop / Ready / Go" based on traffic light color.
import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine().toLowerCase();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color!");

    }
}
}