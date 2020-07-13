import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int rev = 0, d;
        while (num != 0) {
            d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        System.out.println("The reverse number is: " + rev);
    }
}