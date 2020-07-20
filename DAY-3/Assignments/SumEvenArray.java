import java.util.Scanner;

public class SumEvenArray {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements :");
        int n = s.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if (a[i] % 2 == 0)
                sum = sum + a[i];
        }

        System.out.println("Sum of even integers = " + sum);
    }
}