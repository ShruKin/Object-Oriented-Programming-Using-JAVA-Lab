abstract class Asset {
    protected String descriptor, date;
    protected double current_value;

    public Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    abstract public void displayDetails();
}

class Stock extends Asset {
    int num_shares;
    double share_price;
    float asset;

    public Stock(String descriptor, String date, double current_value, int num_shares, double share_price,
            float asset) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
        this.asset = asset;
    }

    public void displayDetails() {
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Number of shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
        System.out.println("Asset: " + asset);
    }
}

class Bond extends Asset {
    double interest_rate;
    float asset;

    public Bond(String descriptor, String date, double current_value, double interest_rate, float asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    public void displayDetails() {
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
        System.out.println("Asset: " + asset);
    }
}

class Savings extends Asset {
    double interest_rate;
    float asset;

    public Savings(String descriptor, String date, double current_value, double interest_rate, float asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    public void displayDetails() {
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
        System.out.println("Asset: " + asset);
    }
}

public class AssetTest {
    public static void main(String[] args) {
        Stock s = new Stock("Test Stock", "31/08/2020", 11254.69, 16, 12739.6, 17.96f);
        Bond b = new Bond("Test Bond", "31/08/2020", 6531.86, 3653.9, 96.96f);
        Savings sa = new Savings("Test Savings", "31/08/2020", 26421.96, 1248.5, 28.69f);

        s.displayDetails();
        System.out.println("-------------------");
        b.displayDetails();
        System.out.println("-------------------");
        sa.displayDetails();
    }
}