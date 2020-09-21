import java.util.Scanner;

public class MltoKm {
    public static void main(String[] args) {
        double n, km = 0.0;
        System.out.println("Enter the miles: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        km = (n * 1.609);
        System.out.println("The distance in kilometres is " + km);
    }
}