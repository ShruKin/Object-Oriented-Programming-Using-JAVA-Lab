interface Bank {
    String nameOfBank = "HDFC Bank";
    double rateOfInterest = 7.5;
    int noOfYears = 5;

    void print();
}

abstract class Customer {
    protected String customerName;
    protected int customerId;

    Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    abstract public void print();
}

class Account extends Customer implements Bank {
    private long accNo;
    private double accBalance;

    public Account(String customerName, int customerId, long accNo, double accBalance) {
        super(customerName, customerId);
        this.accNo = accNo;
        this.accBalance = accBalance;
    }

    public double calcInterest() {
        return accBalance + ((accBalance * rateOfInterest * noOfYears) / 100);
    }

    public void print() {
        System.out.println(nameOfBank);
        System.out.println("Customer Id.: " + customerId);
        System.out.println("Customer Name.: " + customerName);
        System.out.println("Balance: " + accBalance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Account acc = new Account("Soham Ray", 1654, 12045863, 12500.0);
        acc.print();
        System.out.println("Amount after interest: " + acc.calcInterest());
    }
}
