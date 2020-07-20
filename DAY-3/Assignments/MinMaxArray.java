import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int max = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements :");
        int n = s.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] >= max)
                max = a[i];
            if (a[i] <= min)
                min = a[i];
        }

        System.out.println("Max:" + max);
        System.out.println("Min:" + min);

        s.close();
    }
}