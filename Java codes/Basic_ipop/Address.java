
    
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" name: ");
        String name = sc.nextLine();
        System.out.print("street: ");
        String street = sc.nextLine();
        System.out.print(" city: ");
        String city = sc.nextLine();
        System.out.print(" state: ");
        String state = sc.nextLine();
        System.out.print(" postal code: ");
        String postal = sc.nextLine();
        System.out.print("country: ");
        String country = sc.nextLine();
        System.out.println("\nYour Address:\n" + name + "\n" + street + "\n" + 
                           city + "\n" + state + "\n" +  postal + "\n" + country);
        sc.close();
    }
}

