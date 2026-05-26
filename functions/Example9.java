
import java.util.Scanner;

public class Example9 {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 1){
            return false;
        }
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
