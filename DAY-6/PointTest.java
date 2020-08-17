class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Circle2 {
    private int radius;
    private Point center;

    public Circle2() {
        radius = 1;
        center = new Point(0, 0);
    }

    public Circle2(int radius) {
        this.radius = radius;
        center = new Point(5, 6);
    }

    public Circle2(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area = %.2f\n", area);
    }
}

public class PointTest {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(7);

        Point p = new Point(1, 2);
        Circle2 c3 = new Circle2(14, p);

        c3.displayArea();
    }

}