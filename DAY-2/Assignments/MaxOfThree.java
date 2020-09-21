import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The largest no. is: " + max);
    }
}