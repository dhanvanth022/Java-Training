import java.util.Scanner;

public class Example1 {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;

        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());

        // Concatenation
        String firstName = "Dhanvanth";
        String lastName = "Adari";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));

        // Function Call
        printLetters(fullName);

    }
}
