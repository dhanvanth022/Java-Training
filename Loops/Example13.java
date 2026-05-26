import java.util.Scanner;

public class Example13 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("ENter your numbers: ");
            int n = sc.nextInt();
            if(n%10 == 0 ){
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
