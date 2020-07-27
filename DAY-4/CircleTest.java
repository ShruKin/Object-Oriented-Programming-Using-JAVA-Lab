import java.util.Scanner;
import java.lang.Math;

class Circle {
    private double x, y; // Instance variable
    private double radius; // Instance variable

    public Circle(double x1, double y1, double r) {
        // x1, y1 and r are local variales
        x = x1;
        y = y1;
        radius = r;
    }

    public double calculateCirumference() {
        double cf = 2 * Math.PI * radius;
        return cf;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, r;

        System.out.print("Enter (x,y): ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        System.out.print("Enter radius: ");
        r = scanner.nextDouble();

        Circle aCircle = new Circle(x, y, r);
        // aCircle.getData(x, y, r);

        System.out.println("The circumference is: " + aCircle.calculateCirumference());
        System.out.println("The Area is: " + aCircle.calculateArea());

        scanner.close();
    }
}