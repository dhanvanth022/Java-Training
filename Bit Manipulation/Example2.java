import java.util.Scanner;
//get ith bit
public class Example2 {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n : ");
        int n = sc.nextInt();
        System.out.print("Enter number i :");
        int i = sc.nextInt();
        System.out.println(getIthBit(n, i));
    }
}
