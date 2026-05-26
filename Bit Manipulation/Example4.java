import java.util.Scanner;

public class Example4 {
    // Method to clear (make 0) the ith bit of number n
    public static int clearIthBit(int n, int i) {
        // Create a bitmask by shifting 1 to the left by i positions, then taking NOT (~)
        // Example: i=2 → (1<<2) = 100 (binary) → ~(100) = 011... (binary)
        int bitMask = ~(1 << i);

        // Use AND (&) to clear the ith bit (set it to 0)
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number n
        System.out.print("Enter your Number N : ");
        int n = sc.nextInt();

        // Take input for position i (which bit you want to clear)
        System.out.print("Enter your number I : ");
        int i = sc.nextInt();

        // Print the result after clearing the ith bit of n
        System.out.println(clearIthBit(n, i));
    }
}
