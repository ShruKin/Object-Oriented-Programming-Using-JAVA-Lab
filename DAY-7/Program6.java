import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        s = s.replace('d', 'f');
        System.out.println("String after replacing d with f: " + s);
        sc.close();
    }
}