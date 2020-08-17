import java.util.Scanner;

class Circle {
    private double radius;
    String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Red";
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        System.out.printf("Area of circle is: %.2f\n", c.getArea());

        sc.close();
    }
}