import java.util.Scanner;

public class MatSum {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner scanner = new Scanner(System.in);
        int[][] mat1 = new int[5][5];
        int[][] mat2 = new int[5][5];
        int[][] sum = new int[5][5];

        System.out.print("Enter the number of rows of the first matrix (<=5): ");
        r1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix (<=5): ");
        c1 = scanner.nextInt();

        System.out.println("Enter the data in the array: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("mat1[" + i + "][" + j + "] = ");
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nEnter the number of rows of the second matrix (<=5): ");
        r2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix (<=5): ");
        c2 = scanner.nextInt();

        if (r1 == r2 && c1 == c2) {
            System.out.println("Enter the data in the array: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("mat2[" + i + "][" + j + "] = ");
                    mat2[i][j] = scanner.nextInt();

                    sum[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            System.out.println("\nThe first matrix is: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < r1; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nThe second matrix is: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < r2; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nThe sum of two matrices is: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < r2; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Dimensions of the matices aren't same. Sum cannot be computed!");
        }

        scanner.close();
    }
}