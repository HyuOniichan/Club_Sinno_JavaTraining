// 5.6
import java.util.Scanner;

public class SumMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Rows: ");
        int row = scanner.nextInt();
        System.out.print("Columns: ");
        int col = scanner.nextInt();

        // Initialize the matrices
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        int[][] sum = new int[row][col];

        // Input elements for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Adding the two matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display the resulting matrix
        System.out.println("Sum of the 2 matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
