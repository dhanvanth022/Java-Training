import java.util.Scanner;
public class Example20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int f = sc.nextInt();
        int fact=1;
        for(int i=1;i<=f;i++){
            fact *=i;

        }
        System.out.println("factorial : "+fact);
        
        sc.close();
    }
}
