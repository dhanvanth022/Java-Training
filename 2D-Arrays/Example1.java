import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns

        Scanner sc = new Scanner(System.in);

        // Input values into matrix
        System.out.println("Enter " + (n * m) + " integers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
