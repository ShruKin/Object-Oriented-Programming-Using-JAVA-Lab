import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = scan.nextInt();

        int a = 0;
        int b = 1;
        int c;

        if (limit == 1) {
            System.out.println(a);
        } else if (limit == 2) {
            System.out.println(a + " " + b);
        } else {
            System.out.print(a + " " + b + " ");
            for (int i = 0; i < limit - 2; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}