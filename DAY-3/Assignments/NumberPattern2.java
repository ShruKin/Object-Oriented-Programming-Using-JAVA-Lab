import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        int rows, k = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            k = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k-- + " ");
            }
            k++;
            for (int j = 0; j < i; j++) {
                System.out.print(++k + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}