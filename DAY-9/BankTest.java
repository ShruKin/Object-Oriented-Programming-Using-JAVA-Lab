abstract class Account {
    double balance;
    long accountNumber;
    String accountHoldersName, address;

    abstract public void withdrawl(double amt);

    abstract public void deposit(double amt);

    public Account(double balance, long accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    public void display() {
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

class SavingsAccount extends Account {
    double rateOfInterest;

    public SavingsAccount(double balance, long accountNumber, String accountHoldersName, String address,
            double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    public void withdrawl(double amt) {
        balance -= amt;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public double calculateAmount(int time) {
        double amount = balance + (balance * rateOfInterest * time) / 100;
        return amount;
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10000, 2345367263843l, "Abhishek", "Red Road", 8.5);

        sa.withdrawl(500);
        sa.deposit(1000);

        sa.display();
        System.out.println("Amount: " + sa.calculateAmount(2));
    }
}