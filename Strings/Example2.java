import java.util.Scanner;

public class Example2 {

    public static boolean isPalindrome(String name) {
        int n = name.length();
        for (int i = 0; i < n / 2; i++) {

            if (name.charAt(i) != name.charAt(n - 1 - i)) {

                // not a plindrome

                return false;

            }

        }

        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String name;
        name = sc.next();
        System.out.println(isPalindrome(name));

    }
}