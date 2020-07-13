import java.util.Scanner;

public class SwapNums {
    public static void main(String[] args) {
        int n, m, c = 0;
        System.out.println("Enter two numbers, n and m : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = n;
        n = m;
        m = c;
        System.out.println("The new values of n and m are " + n + ", " + m);
    }
}