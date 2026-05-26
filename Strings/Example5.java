import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create array of size 3
        String[] fruits = new String[3];

        System.out.println("Enter 3 fruit names:");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.nextLine(); // take string input
        }

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) > 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
        sc.close();
    }
}
