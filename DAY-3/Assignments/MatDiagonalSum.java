import java.util.Scanner;

public class MatDiagonalSum {
    public static void main(String[] args) {
        int r, sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[5][5];

        System.out.print("Enter the number of rows (<=5): ");
        r = scanner.nextInt();

        System.out.println("Enter the data in the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += mat[i][j];
                }
            }
        }

        System.out.println("\nThe matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the diagonal elements is: " + sum);

        scanner.close();
    }
}