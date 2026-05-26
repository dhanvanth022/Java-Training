import java.util.Scanner;

public class Example3 {

    // Method to set the ith bit of number n
    public static int setIthBit(int n, int i){
        // Create a bitmask by shifting 1 to the left by i positions
        int bitMask = 1 << i;

        // Use OR (|) to set the ith bit of n to 1
        return n | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number n
        System.out.print("Enter your Number N : ");
        int n = sc.nextInt();

        // Take input for position i (which bit you want to set)
        System.out.print("Enter your number I : ");
        int i = sc.nextInt();

        // Print the result after setting the ith bit of n
        System.out.println(setIthBit(n, i));
    }
}
