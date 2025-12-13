
    import java.util.Scanner;
    public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5]; // Array to store marks

        // Read marks for 5 subjects
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nYour Marks:");

        // Print marks on new lines
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}


