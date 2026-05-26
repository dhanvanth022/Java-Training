
import java.util.Scanner;

public class Example4 {
    public static int product(int a , int b){
        int pro = a*b;
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your number a: ");
        int a = sc.nextInt();
        System.out.print("Enrer your number b: ");
        int b = sc.nextInt();
        int product = product(a,b);
        System.out.print("Product of a and b : "+product);
    }
}
