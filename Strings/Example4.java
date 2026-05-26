import java.util.Scanner;

public class Example4 {
    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        System.out.print("Enter the starting index: ");
        int si = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int ei = sc.nextInt();
        System.out.print("you substring is : ");
        System.out.print(subString(str, si, ei));
        sc.close();
    }

}
