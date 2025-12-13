import java.util.Scanner;

public class Dobfromat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("day: ");
        int day = sc.nextInt();
        System.out.print("month: ");
        int month = sc.nextInt();
        System.out.print("year: ");
        int year = sc.nextInt();
        System.out.println( + day + "/" + month + "/" + year);
}
}