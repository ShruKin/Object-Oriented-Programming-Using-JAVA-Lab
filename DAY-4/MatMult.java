import java.util.Scanner;

public class MatMult {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner scanner = new Scanner(System.in);
        int[][] mat1 = new int[5][5];
        int[][] mat2 = new int[5][5];
        int[][] mat3 = new int[5][5];

        System.out.print("Enter the number of rows of the first matrix (<=5): ");
        r1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix (<=5): ");
        c1 = scanner.nextInt();

        System.out.println("Enter the data in the first matrix: ");
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

        if (r1 == r2 && c1 == c2 && r2 == c1) {
            System.out.println("Enter the data in the second matrix: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("mat2[" + i + "][" + j + "] = ");
                    mat2[i][j] = scanner.nextInt();

                }
            }

            System.out.println("\nThe product of two matrices is: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    mat3[i][j] = 0;
                    for (int k = 0; k < c1; k++)
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
            System.out.println("Product is : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Product cannot be computed!");
        }

        scanner.close();
    }
}