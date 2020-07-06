import java.util.Scanner;

public class ChangeTemp {
    public static void main(String[] args) {
        double c, f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        c = scan.nextDouble();
        f = (c * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is: " + f);
        scan.close();
    }
}