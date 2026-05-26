import java.util.Scanner;

//Write a program to print all even numbers between 1 to 100
public class Example17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your N numbers: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
