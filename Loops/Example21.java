// Write a program to find the value of one number raised to the power of another
import java.util.Scanner;


public class Example21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Base number : ");
        int Base = sc.nextInt();
        System.out.print("Enter your power number : ");
        int power = sc.nextInt();

        int result = 1;
        for(int i=1; i<=power;i++){
            result *= Base;
        }
        System.out.println("Result : "+result);
        sc.close();
    }
}
