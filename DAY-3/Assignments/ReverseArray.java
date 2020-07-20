import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int r, temp;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];

        System.out.print("Enter the number of elements (<=20): ");
        r = scanner.nextInt();

        System.out.println("Enter the data in the array: ");
        for (int i = 0; i < r; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < r / 2; i++) {
            temp = arr[i];
            arr[i] = arr[r - i - 1];
            arr[r - i - 1] = temp;
        }

        System.out.println("\nThe Array after reversing: ");
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}