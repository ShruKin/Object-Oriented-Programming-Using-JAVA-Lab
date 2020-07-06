import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is an even number!");
        } else {
            System.out.println(n + " is an odd number!");
        }

        scan.close();
    }
}