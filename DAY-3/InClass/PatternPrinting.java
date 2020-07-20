import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        int rows;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}