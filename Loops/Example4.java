//print SUM of first n natural numbers

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter N numbers: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            i++;
            
        }
        System.out.println(sum);

        sc.close();
    }
}
