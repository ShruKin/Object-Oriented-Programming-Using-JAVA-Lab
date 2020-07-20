import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        int rows;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        for (int i = 0; i < (rows * 2) + 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <= ((rows - i) * 2) - 4; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= rows - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        scanner.close();
    }
}