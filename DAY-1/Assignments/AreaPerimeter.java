import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        double l, b, area, perimeter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        l = scan.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        b = scan.nextDouble();

        area = l * b;
        perimeter = 2 * (l + b);
        System.out.println("The Area of the rectangle is: " + area);
        System.out.println("The Perimeter of the rectangle is: " + perimeter);
        scan.close();
    }
}