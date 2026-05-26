
import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your N number: ");
        int N = sc.nextInt();
        for(int i = 1;i<=N;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
