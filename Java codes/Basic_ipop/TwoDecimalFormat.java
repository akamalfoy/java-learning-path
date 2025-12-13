import java.util.Scanner;

public class TwoDecimalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.printf("Formatted number: %.2f", num);
    }
}
