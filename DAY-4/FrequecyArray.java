import java.util.Scanner;

public class FrequecyArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        boolean visited[] = new boolean[n];
        int count;
        System.out.println("\nElement\tFrequency");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(a[i] + "\t" + count);

            s.close();
        }
    }
}