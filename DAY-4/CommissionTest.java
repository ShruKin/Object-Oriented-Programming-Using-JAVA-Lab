import java.util.Scanner;

class Commission {
    private int sales;

    public Commission(int s) {
        sales = s;
    }

    public double commission() {
        return 0.2 * sales;
    }
}

public class CommissionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales: ");
        int sales = scanner.nextInt();
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission aCommission = new Commission(sales);
            System.out.println("The commission is: " + aCommission.commission());
        }

        scanner.close();
    }
}