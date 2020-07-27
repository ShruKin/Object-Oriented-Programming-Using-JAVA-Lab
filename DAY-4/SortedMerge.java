import java.util.Scanner;

public class SortedMerge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements for array A: ");
        int n1 = s.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter the elements of array A: ");
        for (int i = 0; i < n1; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Enter no. of elements for array B: ");
        int n2 = s.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter the elements of array B: ");
        for (int i = 0; i < n2; i++) {
            b[i] = s.nextInt();
        }

        int sortedab[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j])
                sortedab[k++] = a[i++];
            else
                sortedab[k++] = b[j++];
        }

        while (i < n1) {
            sortedab[k++] = a[i++];
        }

        while (j < n2) {
            sortedab[k++] = b[j++];
        }

        System.out.println("\nThe Array after merging and sorting: ");
        for (int l = 0; l < n1 + n2; l++) {
            System.out.print(sortedab[l] + " ");
        }

        s.close();
    }
}