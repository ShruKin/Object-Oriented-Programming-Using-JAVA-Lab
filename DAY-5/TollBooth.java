import java.util.Scanner;

class Car {
    private static int totalCars = 0;
    private static int paidTax = 0;

    public Car() {
        totalCars++;
    }

    public void tax() {
        paidTax++;
    }

    public int getTotalCars() {
        return totalCars;
    }

    public int getPaidTax() {
        return paidTax;
    }
}

public class TollBooth {
    public static void main(String[] args) {
        int ch, ptax;
        Scanner sc = new Scanner(System.in);
        Car nCar = null;

        do {
            System.out.print("Enter 1 to pass a car, any other number to stop: ");

            ch = sc.nextInt();
            if (ch != 1) {
                break;
            }
            nCar = new Car();

            System.out.print("Enter 2 to pay tax, any other number to skip: ");
            ptax = sc.nextInt();
            if (ptax == 2) {
                nCar.tax();
            }
        } while (ch == 1);

        System.out.println("\nNo. of cars passed by: " + nCar.getTotalCars());

        int notPaid = nCar.getTotalCars() - nCar.getPaidTax();
        System.out.println("Total no. of cars who have not paid the tax: " + notPaid);

        int amount = nCar.getPaidTax() * 50;
        System.out.println("Amount of cash collected: " + amount);

        sc.close();
    }
}