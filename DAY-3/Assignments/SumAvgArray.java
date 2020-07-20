import java.util.Scanner;

public class SumAvgArray {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements :");
        int n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum:" + sum);
        avg = (float) sum / n;
        System.out.println("Average:" + avg);

        s.close();
    }
}