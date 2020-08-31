abstract class MotorVehicle {
    protected String modelName;
    protected long modelNumber;
    protected double modelPrice;

    public MotorVehicle(String modelName, long modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    abstract public void display();

}

class Car extends MotorVehicle {
    double discountRate;

    public Car(String modelName, long modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Model price: " + modelPrice);

    }

    public void discount() {
        double discountedPrice = modelPrice * (1 - (discountRate / 100));

        System.out.println("Discounted Price: " + discountedPrice);
    }
}

public class MotorVehicleTest {
    public static void main(String[] args) {
        Car c = new Car("Tata Nano", 231423543141l, 350000, 4.5);
        c.display();
        c.discount();
    }

}