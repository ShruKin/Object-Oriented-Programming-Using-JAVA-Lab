import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n > 0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
    }
}