import java.util.Scanner;

public class AlternateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n1 = s.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("\nThe every alternate numbers of the array: ");
        for (int i = 0; i < n1; i += 2) {
            System.out.print(a[i] + " ");
        }

        s.close();
    }
}