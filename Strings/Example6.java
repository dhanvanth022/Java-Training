import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];

        System.out.println("Enter 3 strings:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine(); // take string input
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("String " + (i + 1) + ": " + arr[i]);
        }

        sc.close();
    }
}
