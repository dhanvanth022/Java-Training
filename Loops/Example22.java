import java.util.*;
public class Example22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        while(num>0){
            int lastDigit = num % 10;
            System.out.print(lastDigit+" ");
            num/=10;

        }

    }
}
