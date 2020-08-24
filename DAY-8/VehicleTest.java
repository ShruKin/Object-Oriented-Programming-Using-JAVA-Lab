class Vehicle {
    protected int regnNumber, speed;
    protected String color, ownerName;

    public Vehicle(int regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is Vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);

    }
}

class Car extends Vehicle {
    private String manufactureName;

    public Car(int regnNumber, int speed, String color, String ownerName, String manufactureName) {
        super(regnNumber, speed, color, ownerName);
        this.manufactureName = manufactureName;
    }

    public void showData() {
        super.showData();
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacture Name: " + manufactureName);

    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Bus b = new Bus(1, 100, "Red", "Ramesh", 13);
        Car c = new Car(2, 200, "Blue", "Karan", "Tata");
        b.showData();
        System.out.println("--------------------------------");
        c.showData();
    }
}