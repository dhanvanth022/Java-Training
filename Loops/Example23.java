
import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        sc.close();
        int a = num;
        int sum = 0;
        int rem = 0;

        while(num>0){
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println("Given number "+ a);
        System.out.print("Sum of the digit "+sum);
    }
}